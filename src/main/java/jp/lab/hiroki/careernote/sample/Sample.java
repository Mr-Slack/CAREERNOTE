package jp.lab.hiroki.careernote.sample;

import java.util.Date;

public class Sample {
    
	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_id
     *
     * @mbg.generated
     */
    private Integer sampleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_decimal
     *
     * @mbg.generated
     */
    private Float sampleDecimal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_date
     *
     * @mbg.generated
     */
    private Date sampleDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_timestamp
     *
     * @mbg.generated
     */
    private Date sampleTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_str_fix
     *
     * @mbg.generated
     */
    private String sampleStrFix;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_str_var
     *
     * @mbg.generated
     */
    private String sampleStrVar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sample.sample_enum
     *
     * @mbg.generated
     */
    private String sampleEnum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_id
     *
     * @return the value of sample.sample_id
     *
     * @mbg.generated
     */
    public Integer getSampleId() {
        return sampleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_id
     *
     * @param sampleId the value for sample.sample_id
     *
     * @mbg.generated
     */
    public void setSampleId(Integer sampleId) {
        this.sampleId = sampleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_decimal
     *
     * @return the value of sample.sample_decimal
     *
     * @mbg.generated
     */
    public Float getSampleDecimal() {
        return sampleDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_decimal
     *
     * @param sampleDecimal the value for sample.sample_decimal
     *
     * @mbg.generated
     */
    public void setSampleDecimal(Float sampleDecimal) {
        this.sampleDecimal = sampleDecimal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_date
     *
     * @return the value of sample.sample_date
     *
     * @mbg.generated
     */
    public Date getSampleDate() {
        return sampleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_date
     *
     * @param sampleDate the value for sample.sample_date
     *
     * @mbg.generated
     */
    public void setSampleDate(Date sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_timestamp
     *
     * @return the value of sample.sample_timestamp
     *
     * @mbg.generated
     */
    public Date getSampleTimestamp() {
        return sampleTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_timestamp
     *
     * @param sampleTimestamp the value for sample.sample_timestamp
     *
     * @mbg.generated
     */
    public void setSampleTimestamp(Date sampleTimestamp) {
        this.sampleTimestamp = sampleTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_str_fix
     *
     * @return the value of sample.sample_str_fix
     *
     * @mbg.generated
     */
    public String getSampleStrFix() {
        return sampleStrFix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_str_fix
     *
     * @param sampleStrFix the value for sample.sample_str_fix
     *
     * @mbg.generated
     */
    public void setSampleStrFix(String sampleStrFix) {
        this.sampleStrFix = sampleStrFix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_str_var
     *
     * @return the value of sample.sample_str_var
     *
     * @mbg.generated
     */
    public String getSampleStrVar() {
        return sampleStrVar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_str_var
     *
     * @param sampleStrVar the value for sample.sample_str_var
     *
     * @mbg.generated
     */
    public void setSampleStrVar(String sampleStrVar) {
        this.sampleStrVar = sampleStrVar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sample.sample_enum
     *
     * @return the value of sample.sample_enum
     *
     * @mbg.generated
     */
    public String getSampleEnum() {
        return sampleEnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sample.sample_enum
     *
     * @param sampleEnum the value for sample.sample_enum
     *
     * @mbg.generated
     */
    public void setSampleEnum(String sampleEnum) {
        this.sampleEnum = sampleEnum;
    }
    
    @Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleDecimal=" + sampleDecimal + ", sampleDate=" + sampleDate
				+ ", sampleTimestamp=" + sampleTimestamp + ", sampleStrFix=" + sampleStrFix + ", sampleStrVar="
				+ sampleStrVar + ", sampleEnum=" + sampleEnum + "]";
	}
}