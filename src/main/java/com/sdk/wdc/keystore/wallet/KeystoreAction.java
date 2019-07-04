package com.sdk.wdc.keystore.wallet;

import com.sdk.wdc.keystore.crypto.ed25519.Ed25519PrivateKey;
import com.sdk.wdc.keystore.crypto.ed25519.Ed25519PublicKey;
import com.sdk.wdc.keystore.util.Base58Utility;
import com.sdk.wdc.keystore.util.ByteUtil;
import com.sdk.wdc.keystore.util.ByteUtils;
import com.sdk.wdc.keystore.util.Utils;
import com.google.common.primitives.Bytes;
import com.sdk.wdc.keystore.account.Address;
import com.sdk.wdc.keystore.crypto.*;
import org.apache.commons.codec.binary.Hex;

import java.math.BigInteger;
import java.security.SecureRandom;

public class KeystoreAction {
    private static final String t = "1000000000000000000000000000000014def9dea2f79cd65812631a5cf5d3ec";
    public String address;
    public Crypto crypto;
    private static final int saltLength = 32;
    private static final int ivLength = 16;
    private static final String defaultVersion = "1";
    private SecureRandom random;


    public static String pta(byte[] pubkey){
        byte[] pub256 = SHA3Utility.keccak256(pubkey);
        byte[] r1 = RipemdUtility.ripemd160(pub256);
        byte[] r2 = ByteUtil.prepend(r1,(byte)0x00);
        byte[] r3 = SHA3Utility.keccak256(SHA3Utility.keccak256(r1));
        byte[] b4 = ByteUtil.bytearraycopy(r3,0,4);
        byte[] b5 = ByteUtil.byteMerger(r2,b4);
        String s6 = Base58Utility.encode(b5);
        return  s6;
    }

    public static byte[] atph(String address){
        byte[] r5 = Base58Utility.decode(address);
        byte[] r2 = ByteUtil.bytearraycopy(r5,0,21);
        byte[] r1 = ByteUtil.bytearraycopy(r2,1,20);
        return  r1;
    }

    public static String phta(byte[] r1){
        byte[] r2 = ByteUtil.prepend(r1,(byte)0x00);
        byte[] r3 = SHA3Utility.keccak256(SHA3Utility.keccak256(r1));
        byte[] b4 = ByteUtil.bytearraycopy(r3,0,4);
        byte[] b5 = ByteUtil.byteMerger(r2,b4);
        String s6 = Base58Utility.encode(b5);
        return  s6;
    }

    public static byte[] decrypt(Keystore keystore,String password) throws Exception{
        if (!verifyPassword(keystore,password)){
            throw new Exception("invalid password");
        }
        ArgonManage argon2id = new ArgonManage(ArgonManage.Type.ARGON2id, Hex.decodeHex(keystore.kdfparams.salt.toCharArray()));
        byte[] derivedKey = argon2id.hash(password.getBytes());
        byte[] iv = Hex.decodeHex(keystore.crypto.cipherparams.iv.toCharArray());
        AESManage aes = new AESManage(iv);
        return aes.decrypt(derivedKey, Hex.decodeHex(keystore.crypto.ciphertext.toCharArray()));
    }

    public static boolean verifyPassword(Keystore keystore,String password) throws Exception{
        // 验证密码是否正确 计算 mac
        ArgonManage argon2id = new ArgonManage(ArgonManage.Type.ARGON2id, Hex.decodeHex(keystore.kdfparams.salt.toCharArray()));
        byte[] derivedKey = argon2id.hash(password.getBytes());
        byte[] cipherPrivKey = Hex.decodeHex(keystore.crypto.ciphertext.toCharArray());
        byte[] mac = SHA3Utility.keccak256(Bytes.concat(
                derivedKey,cipherPrivKey
                )
        );
        return Hex.encodeHexString(mac).equals(keystore.mac);
    }

    public static String obPrikey(Keystore ks,String password) throws Exception {
        String privateKey =  Hex.encodeHexString(KeystoreAction.decrypt(ks,password));
        return privateKey;
    }

    public static String prikeyToPubkey(String prikey) throws Exception {
        if(prikey.length() != 64 || new BigInteger(Hex.decodeHex(prikey.toCharArray())).compareTo(new BigInteger(ByteUtils.hexStringToBytes(t))) > 0){
            throw new Exception("Private key format error");
        }
        Ed25519PrivateKey eprik = new Ed25519PrivateKey(Hex.decodeHex(prikey.toCharArray()));
        Ed25519PublicKey epuk = eprik.generatePublicKey();
        String pubkey = Hex.encodeHexString(epuk.getEncoded());
        return pubkey;
    }

    public static Keystore fromPassword(String password) throws Exception{
        if (password.length()>20 || password.length()<8){
            throw new Exception("请输入8-20位密码");
        }else {
            KeyPair keyPair = KeyPair.generateEd25519KeyPair();
            PublicKey publicKey = keyPair.getPublicKey();
            String s=new String(keyPair.getPrivateKey().getEncoded());
            byte[] salt = new byte[saltLength];
            byte[] iv = new byte[ivLength];
            SecureRandom random = new SecureRandom();
            random.nextBytes(iv);
            SecureRandom sr = new SecureRandom();
            sr.nextBytes(salt);
            ArgonManage argon2id = new ArgonManage(ArgonManage.Type.ARGON2id, salt);
            AESManage aes = new AESManage(iv);

            byte[] derivedKey = argon2id.hash(password.getBytes());
            byte[] cipherPrivKey = aes.encrypt(derivedKey, keyPair.getPrivateKey().getBytes());
            byte[] mac = SHA3Utility.keccak256(Bytes.concat(
                    derivedKey, cipherPrivKey
                    )
            );

            Crypto crypto = new Crypto(
                    AESManage.cipher, Hex.encodeHexString(cipherPrivKey),
                    new Cipherparams(
                            Hex.encodeHexString(iv)
                    )
            );
            Kdfparams kdfparams = new Kdfparams(ArgonManage.memoryCost, ArgonManage.timeCost, ArgonManage.parallelism, Hex.encodeHexString(salt));
            Address ads = new Address(publicKey);
            ArgonManage params = new ArgonManage(salt);
            Keystore ks = new Keystore(ads.getAddress(), crypto, Utils.generateUUID(),
                    defaultVersion, Hex.encodeHexString(mac), argon2id.kdf(), kdfparams
            );
            return ks;
        }
    }
}
