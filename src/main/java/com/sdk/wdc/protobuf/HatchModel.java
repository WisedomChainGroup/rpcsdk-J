// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hatch.proto

package com.sdk.wdc.protobuf;

public final class HatchModel {
  private HatchModel() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HatchOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.wdc.protobuf.Hatch)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes info = 1;</code>
     */
    com.google.protobuf.ByteString getInfo();
  }
  /**
   * Protobuf type {@code com.example.wdc.protobuf.Hatch}
   */
  public  static final class Hatch extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.wdc.protobuf.Hatch)
      HatchOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Hatch.newBuilder() to construct.
    private Hatch(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Hatch() {
      info_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Hatch(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {

              info_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HatchModel.internal_static_com_example_wdc_protobuf_Hatch_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HatchModel.internal_static_com_example_wdc_protobuf_Hatch_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Hatch.class, Builder.class);
    }

    public static final int INFO_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString info_;
    /**
     * <code>bytes info = 1;</code>
     */
    public com.google.protobuf.ByteString getInfo() {
      return info_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!info_.isEmpty()) {
        output.writeBytes(1, info_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!info_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, info_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Hatch)) {
        return super.equals(obj);
      }
      Hatch other = (Hatch) obj;

      boolean result = true;
      result = result && getInfo()
          .equals(other.getInfo());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Hatch parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Hatch parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Hatch parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Hatch parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Hatch parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Hatch parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Hatch parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Hatch parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Hatch parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Hatch parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Hatch parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Hatch parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Hatch prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.wdc.protobuf.Hatch}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.wdc.protobuf.Hatch)
        HatchOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Hatch_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Hatch_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Hatch.class, Builder.class);
      }

      // Construct using com.example.wdc.protobuf.HatchModel.Hatch.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        info_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Hatch_descriptor;
      }

      @Override
      public Hatch getDefaultInstanceForType() {
        return Hatch.getDefaultInstance();
      }

      @Override
      public Hatch build() {
        Hatch result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Hatch buildPartial() {
        Hatch result = new Hatch(this);
        result.info_ = info_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Hatch) {
          return mergeFrom((Hatch)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Hatch other) {
        if (other == Hatch.getDefaultInstance()) return this;
        if (other.getInfo() != com.google.protobuf.ByteString.EMPTY) {
          setInfo(other.getInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Hatch parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Hatch) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString info_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes info = 1;</code>
       */
      public com.google.protobuf.ByteString getInfo() {
        return info_;
      }
      /**
       * <code>bytes info = 1;</code>
       */
      public Builder setInfo(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        info_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes info = 1;</code>
       */
      public Builder clearInfo() {
        
        info_ = getDefaultInstance().getInfo();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.wdc.protobuf.Hatch)
    }

    // @@protoc_insertion_point(class_scope:com.example.wdc.protobuf.Hatch)
    private static final Hatch DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Hatch();
    }

    public static Hatch getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Hatch>
        PARSER = new com.google.protobuf.AbstractParser<Hatch>() {
      @Override
      public Hatch parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Hatch(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Hatch> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Hatch> getParserForType() {
      return PARSER;
    }

    @Override
    public Hatch getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PayloadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.example.wdc.protobuf.Payload)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes tx_id = 1;</code>
     */
    com.google.protobuf.ByteString getTxId();

    /**
     * <code>string share_pubkey_hash = 2;</code>
     */
    String getSharePubkeyHash();
    /**
     * <code>string share_pubkey_hash = 2;</code>
     */
    com.google.protobuf.ByteString
        getSharePubkeyHashBytes();

    /**
     * <code>uint32 type = 3;</code>
     */
    int getType();
  }
  /**
   * Protobuf type {@code com.example.wdc.protobuf.Payload}
   */
  public  static final class Payload extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.example.wdc.protobuf.Payload)
      PayloadOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Payload.newBuilder() to construct.
    private Payload(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Payload() {
      txId_ = com.google.protobuf.ByteString.EMPTY;
      sharePubkeyHash_ = "";
      type_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Payload(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {

              txId_ = input.readBytes();
              break;
            }
            case 18: {
              String s = input.readStringRequireUtf8();

              sharePubkeyHash_ = s;
              break;
            }
            case 24: {

              type_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HatchModel.internal_static_com_example_wdc_protobuf_Payload_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HatchModel.internal_static_com_example_wdc_protobuf_Payload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Payload.class, Builder.class);
    }

    public static final int TX_ID_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString txId_;
    /**
     * <code>bytes tx_id = 1;</code>
     */
    public com.google.protobuf.ByteString getTxId() {
      return txId_;
    }

    public static final int SHARE_PUBKEY_HASH_FIELD_NUMBER = 2;
    private volatile Object sharePubkeyHash_;
    /**
     * <code>string share_pubkey_hash = 2;</code>
     */
    public String getSharePubkeyHash() {
      Object ref = sharePubkeyHash_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        sharePubkeyHash_ = s;
        return s;
      }
    }
    /**
     * <code>string share_pubkey_hash = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSharePubkeyHashBytes() {
      Object ref = sharePubkeyHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        sharePubkeyHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>uint32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!txId_.isEmpty()) {
        output.writeBytes(1, txId_);
      }
      if (!getSharePubkeyHashBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sharePubkeyHash_);
      }
      if (type_ != 0) {
        output.writeUInt32(3, type_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!txId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, txId_);
      }
      if (!getSharePubkeyHashBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sharePubkeyHash_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof Payload)) {
        return super.equals(obj);
      }
      Payload other = (Payload) obj;

      boolean result = true;
      result = result && getTxId()
          .equals(other.getTxId());
      result = result && getSharePubkeyHash()
          .equals(other.getSharePubkeyHash());
      result = result && (getType()
          == other.getType());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TX_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTxId().hashCode();
      hash = (37 * hash) + SHARE_PUBKEY_HASH_FIELD_NUMBER;
      hash = (53 * hash) + getSharePubkeyHash().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static Payload parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Payload parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Payload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Payload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Payload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Payload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Payload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Payload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static Payload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static Payload parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static Payload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static Payload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(Payload prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.example.wdc.protobuf.Payload}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.example.wdc.protobuf.Payload)
        PayloadOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Payload_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Payload_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Payload.class, Builder.class);
      }

      // Construct using com.example.wdc.protobuf.HatchModel.Payload.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        txId_ = com.google.protobuf.ByteString.EMPTY;

        sharePubkeyHash_ = "";

        type_ = 0;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return HatchModel.internal_static_com_example_wdc_protobuf_Payload_descriptor;
      }

      @Override
      public Payload getDefaultInstanceForType() {
        return Payload.getDefaultInstance();
      }

      @Override
      public Payload build() {
        Payload result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public Payload buildPartial() {
        Payload result = new Payload(this);
        result.txId_ = txId_;
        result.sharePubkeyHash_ = sharePubkeyHash_;
        result.type_ = type_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Payload) {
          return mergeFrom((Payload)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Payload other) {
        if (other == Payload.getDefaultInstance()) return this;
        if (other.getTxId() != com.google.protobuf.ByteString.EMPTY) {
          setTxId(other.getTxId());
        }
        if (!other.getSharePubkeyHash().isEmpty()) {
          sharePubkeyHash_ = other.sharePubkeyHash_;
          onChanged();
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Payload parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Payload) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes tx_id = 1;</code>
       */
      public com.google.protobuf.ByteString getTxId() {
        return txId_;
      }
      /**
       * <code>bytes tx_id = 1;</code>
       */
      public Builder setTxId(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        txId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes tx_id = 1;</code>
       */
      public Builder clearTxId() {
        
        txId_ = getDefaultInstance().getTxId();
        onChanged();
        return this;
      }

      private Object sharePubkeyHash_ = "";
      /**
       * <code>string share_pubkey_hash = 2;</code>
       */
      public String getSharePubkeyHash() {
        Object ref = sharePubkeyHash_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          sharePubkeyHash_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string share_pubkey_hash = 2;</code>
       */
      public com.google.protobuf.ByteString
          getSharePubkeyHashBytes() {
        Object ref = sharePubkeyHash_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          sharePubkeyHash_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string share_pubkey_hash = 2;</code>
       */
      public Builder setSharePubkeyHash(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        sharePubkeyHash_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string share_pubkey_hash = 2;</code>
       */
      public Builder clearSharePubkeyHash() {
        
        sharePubkeyHash_ = getDefaultInstance().getSharePubkeyHash();
        onChanged();
        return this;
      }
      /**
       * <code>string share_pubkey_hash = 2;</code>
       */
      public Builder setSharePubkeyHashBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        sharePubkeyHash_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <code>uint32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>uint32 type = 3;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.example.wdc.protobuf.Payload)
    }

    // @@protoc_insertion_point(class_scope:com.example.wdc.protobuf.Payload)
    private static final Payload DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Payload();
    }

    public static Payload getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Payload>
        PARSER = new com.google.protobuf.AbstractParser<Payload>() {
      @Override
      public Payload parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Payload(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Payload> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Payload> getParserForType() {
      return PARSER;
    }

    @Override
    public Payload getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_wdc_protobuf_Hatch_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_wdc_protobuf_Hatch_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_wdc_protobuf_Payload_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_wdc_protobuf_Payload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\013Hatch.proto\022\030com.example.wdc.protobuf\"" +
      "\025\n\005Hatch\022\014\n\004info\030\001 \001(\014\"A\n\007Payload\022\r\n\005tx_" +
      "id\030\001 \001(\014\022\031\n\021share_pubkey_hash\030\002 \001(\t\022\014\n\004t" +
      "ype\030\003 \001(\rB\016B\nHatchModelH\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_example_wdc_protobuf_Hatch_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_wdc_protobuf_Hatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_wdc_protobuf_Hatch_descriptor,
        new String[] { "Info", });
    internal_static_com_example_wdc_protobuf_Payload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_wdc_protobuf_Payload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_wdc_protobuf_Payload_descriptor,
        new String[] { "TxId", "SharePubkeyHash", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
