/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.pharbers.kafka.schema;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class SparkJob extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7664455039210424725L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SparkJob\",\"namespace\":\"com.pharbers.kafka.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"bucketName\",\"type\":\"string\"},{\"name\":\"ossKey\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence id;
  @Deprecated public java.lang.CharSequence bucketName;
  @Deprecated public java.lang.CharSequence ossKey;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SparkJob() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param bucketName The new value for bucketName
   * @param ossKey The new value for ossKey
   */
  public SparkJob(java.lang.CharSequence id, java.lang.CharSequence bucketName, java.lang.CharSequence ossKey) {
    this.id = id;
    this.bucketName = bucketName;
    this.ossKey = ossKey;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return bucketName;
    case 2: return ossKey;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: bucketName = (java.lang.CharSequence)value$; break;
    case 2: ossKey = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'bucketName' field.
   * @return The value of the 'bucketName' field.
   */
  public java.lang.CharSequence getBucketName() {
    return bucketName;
  }

  /**
   * Sets the value of the 'bucketName' field.
   * @param value the value to set.
   */
  public void setBucketName(java.lang.CharSequence value) {
    this.bucketName = value;
  }

  /**
   * Gets the value of the 'ossKey' field.
   * @return The value of the 'ossKey' field.
   */
  public java.lang.CharSequence getOssKey() {
    return ossKey;
  }

  /**
   * Sets the value of the 'ossKey' field.
   * @param value the value to set.
   */
  public void setOssKey(java.lang.CharSequence value) {
    this.ossKey = value;
  }

  /**
   * Creates a new SparkJob RecordBuilder.
   * @return A new SparkJob RecordBuilder
   */
  public static com.pharbers.kafka.schema.SparkJob.Builder newBuilder() {
    return new com.pharbers.kafka.schema.SparkJob.Builder();
  }

  /**
   * Creates a new SparkJob RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SparkJob RecordBuilder
   */
  public static com.pharbers.kafka.schema.SparkJob.Builder newBuilder(com.pharbers.kafka.schema.SparkJob.Builder other) {
    return new com.pharbers.kafka.schema.SparkJob.Builder(other);
  }

  /**
   * Creates a new SparkJob RecordBuilder by copying an existing SparkJob instance.
   * @param other The existing instance to copy.
   * @return A new SparkJob RecordBuilder
   */
  public static com.pharbers.kafka.schema.SparkJob.Builder newBuilder(com.pharbers.kafka.schema.SparkJob other) {
    return new com.pharbers.kafka.schema.SparkJob.Builder(other);
  }

  /**
   * RecordBuilder for SparkJob instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SparkJob>
    implements org.apache.avro.data.RecordBuilder<SparkJob> {

    private java.lang.CharSequence id;
    private java.lang.CharSequence bucketName;
    private java.lang.CharSequence ossKey;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.pharbers.kafka.schema.SparkJob.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bucketName)) {
        this.bucketName = data().deepCopy(fields()[1].schema(), other.bucketName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ossKey)) {
        this.ossKey = data().deepCopy(fields()[2].schema(), other.ossKey);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing SparkJob instance
     * @param other The existing instance to copy.
     */
    private Builder(com.pharbers.kafka.schema.SparkJob other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.bucketName)) {
        this.bucketName = data().deepCopy(fields()[1].schema(), other.bucketName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.ossKey)) {
        this.ossKey = data().deepCopy(fields()[2].schema(), other.ossKey);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'bucketName' field.
      * @return The value.
      */
    public java.lang.CharSequence getBucketName() {
      return bucketName;
    }

    /**
      * Sets the value of the 'bucketName' field.
      * @param value The value of 'bucketName'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder setBucketName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.bucketName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'bucketName' field has been set.
      * @return True if the 'bucketName' field has been set, false otherwise.
      */
    public boolean hasBucketName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'bucketName' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder clearBucketName() {
      bucketName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'ossKey' field.
      * @return The value.
      */
    public java.lang.CharSequence getOssKey() {
      return ossKey;
    }

    /**
      * Sets the value of the 'ossKey' field.
      * @param value The value of 'ossKey'.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder setOssKey(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.ossKey = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'ossKey' field has been set.
      * @return True if the 'ossKey' field has been set, false otherwise.
      */
    public boolean hasOssKey() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'ossKey' field.
      * @return This builder.
      */
    public com.pharbers.kafka.schema.SparkJob.Builder clearOssKey() {
      ossKey = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public SparkJob build() {
      try {
        SparkJob record = new SparkJob();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.bucketName = fieldSetFlags()[1] ? this.bucketName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.ossKey = fieldSetFlags()[2] ? this.ossKey : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
