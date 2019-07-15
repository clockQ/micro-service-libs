/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pharbers.kafka.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MonitorResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -662453237078483380L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MonitorResponse\",\"namespace\":\"com.pharbers.kafka.schema\",\"fields\":[{\"name\":\"jobId\",\"type\":\"string\"},{\"name\":\"progress\",\"type\":\"long\"},{\"name\":\"error\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MonitorResponse> ENCODER =
      new BinaryMessageEncoder<MonitorResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MonitorResponse> DECODER =
      new BinaryMessageDecoder<MonitorResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MonitorResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MonitorResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MonitorResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MonitorResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MonitorResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MonitorResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MonitorResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MonitorResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence jobId;
  @Deprecated public long progress;
  @Deprecated public java.lang.CharSequence error;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MonitorResponse() {}

  /**
   * All-args constructor.
   * @param jobId The new value for jobId
   * @param progress The new value for progress
   * @param error The new value for error
   */
  public MonitorResponse(java.lang.CharSequence jobId, java.lang.Long progress, java.lang.CharSequence error) {
    this.jobId = jobId;
    this.progress = progress;
    this.error = error;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return jobId;
    case 1: return progress;
    case 2: return error;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: jobId = (java.lang.CharSequence)value$; break;
    case 1: progress = (java.lang.Long)value$; break;
    case 2: error = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'jobId' field.
   * @return The value of the 'jobId' field.
   */
  public java.lang.CharSequence getJobId() {
    return jobId;
  }


  /**
   * Sets the value of the 'jobId' field.
   * @param value the value to set.
   */
  public void setJobId(java.lang.CharSequence value) {
    this.jobId = value;
  }

  /**
   * Gets the value of the 'progress' field.
   * @return The value of the 'progress' field.
   */
  public long getProgress() {
    return progress;
  }


  /**
   * Sets the value of the 'progress' field.
   * @param value the value to set.
   */
  public void setProgress(long value) {
    this.progress = value;
  }

  /**
   * Gets the value of the 'error' field.
   * @return The value of the 'error' field.
   */
  public java.lang.CharSequence getError() {
    return error;
  }


  /**
   * Sets the value of the 'error' field.
   * @param value the value to set.
   */
  public void setError(java.lang.CharSequence value) {
    this.error = value;
  }

  /**
   * Creates a new MonitorResponse RecordBuilder.
   * @return A new MonitorResponse RecordBuilder
   */
  public static com.pharbers.kafka.schema.MonitorResponse.Builder newBuilder() {
    return new com.pharbers.kafka.schema.MonitorResponse.Builder();
  }

  /**
   * Creates a new MonitorResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MonitorResponse RecordBuilder
   */
  public static com.pharbers.kafka.schema.MonitorResponse.Builder newBuilder(com.pharbers.kafka.schema.MonitorResponse.Builder other) {
    if (other == null) {
      return new com.pharbers.kafka.schema.MonitorResponse.Builder();
    } else {
      return new com.pharbers.kafka.schema.MonitorResponse.Builder(other);
    }
  }

  /**
   * Creates a new MonitorResponse RecordBuilder by copying an existing MonitorResponse instance.
   * @param other The existing instance to copy.
   * @return A new MonitorResponse RecordBuilder
   */
  public static com.pharbers.kafka.schema.MonitorResponse.Builder newBuilder(com.pharbers.kafka.schema.MonitorResponse other) {
    if (other == null) {
      return new com.pharbers.kafka.schema.MonitorResponse.Builder();
    } else {
      return new com.pharbers.kafka.schema.MonitorResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for MonitorResponse instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MonitorResponse>
    implements org.apache.avro.data.RecordBuilder<MonitorResponse> {

    private java.lang.CharSequence jobId;
    private long progress;
    private java.lang.CharSequence error;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pharbers.kafka.schema.MonitorResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.jobId)) {
        this.jobId = data().deepCopy(fields()[0].schema(), other.jobId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.progress)) {
        this.progress = data().deepCopy(fields()[1].schema(), other.progress);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.error)) {
        this.error = data().deepCopy(fields()[2].schema(), other.error);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing MonitorResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pharbers.kafka.schema.MonitorResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.jobId)) {
        this.jobId = data().deepCopy(fields()[0].schema(), other.jobId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.progress)) {
        this.progress = data().deepCopy(fields()[1].schema(), other.progress);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.error)) {
        this.error = data().deepCopy(fields()[2].schema(), other.error);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'jobId' field.
      * @return The value.
      */
    public java.lang.CharSequence getJobId() {
      return jobId;
    }


    /**
      * Sets the value of the 'jobId' field.
      * @param value The value of 'jobId'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder setJobId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.jobId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'jobId' field has been set.
      * @return True if the 'jobId' field has been set, false otherwise.
      */
    public boolean hasJobId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'jobId' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder clearJobId() {
      jobId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'progress' field.
      * @return The value.
      */
    public long getProgress() {
      return progress;
    }


    /**
      * Sets the value of the 'progress' field.
      * @param value The value of 'progress'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder setProgress(long value) {
      validate(fields()[1], value);
      this.progress = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'progress' field has been set.
      * @return True if the 'progress' field has been set, false otherwise.
      */
    public boolean hasProgress() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'progress' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder clearProgress() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'error' field.
      * @return The value.
      */
    public java.lang.CharSequence getError() {
      return error;
    }


    /**
      * Sets the value of the 'error' field.
      * @param value The value of 'error'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder setError(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.error = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'error' field has been set.
      * @return True if the 'error' field has been set, false otherwise.
      */
    public boolean hasError() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'error' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.MonitorResponse.Builder clearError() {
      error = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MonitorResponse build() {
      try {
        MonitorResponse record = new MonitorResponse();
        record.jobId = fieldSetFlags()[0] ? this.jobId : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.progress = fieldSetFlags()[1] ? this.progress : (java.lang.Long) defaultValue(fields()[1]);
        record.error = fieldSetFlags()[2] ? this.error : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MonitorResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<MonitorResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MonitorResponse>
    READER$ = (org.apache.avro.io.DatumReader<MonitorResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.jobId);

    out.writeLong(this.progress);

    out.writeString(this.error);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.jobId = in.readString(this.jobId instanceof Utf8 ? (Utf8)this.jobId : null);

      this.progress = in.readLong();

      this.error = in.readString(this.error instanceof Utf8 ? (Utf8)this.error : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.jobId = in.readString(this.jobId instanceof Utf8 ? (Utf8)this.jobId : null);
          break;

        case 1:
          this.progress = in.readLong();
          break;

        case 2:
          this.error = in.readString(this.error instanceof Utf8 ? (Utf8)this.error : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










