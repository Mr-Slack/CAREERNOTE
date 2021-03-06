package jp.lab.hiroki.careernote.sample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SampleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    @Delete({
        "delete from sample",
        "where sample_id = #{sampleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer sampleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    @Insert({
        "insert into sample (sample_id, sample_decimal, ",
        "sample_date, sample_timestamp, ",
        "sample_str_fix, sample_str_var, ",
        "sample_enum)",
        "values (#{sampleId,jdbcType=INTEGER}, #{sampleDecimal,jdbcType=REAL}, ",
        "#{sampleDate,jdbcType=DATE}, #{sampleTimestamp,jdbcType=TIMESTAMP}, ",
        "#{sampleStrFix,jdbcType=CHAR}, #{sampleStrVar,jdbcType=VARCHAR}, ",
        "#{sampleEnum,jdbcType=CHAR})"
    })
    int insert(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    int insertSelective(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "sample_id, sample_decimal, sample_date, sample_timestamp, sample_str_fix, sample_str_var, ",
        "sample_enum",
        "from sample",
        "where sample_id = #{sampleId,jdbcType=INTEGER}"
    })
    @ResultMap("jp.lab.hiroki.careernote.sample.SampleMapper.BaseResultMap")
    Sample selectByPrimaryKey(Integer sampleId);
    
    @Select({
        "select",
        "sample_id, sample_decimal, sample_date, sample_timestamp, sample_str_fix, sample_str_var, ",
        "sample_enum",
        "from sample"
    })
    @ResultMap("jp.lab.hiroki.careernote.sample.SampleMapper.BaseResultMap")
    List<Sample> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Sample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sample
     *
     * @mbg.generated
     */
    @Update({
        "update sample",
        "set sample_decimal = #{sampleDecimal,jdbcType=REAL},",
          "sample_date = #{sampleDate,jdbcType=DATE},",
          "sample_timestamp = #{sampleTimestamp,jdbcType=TIMESTAMP},",
          "sample_str_fix = #{sampleStrFix,jdbcType=CHAR},",
          "sample_str_var = #{sampleStrVar,jdbcType=VARCHAR},",
          "sample_enum = #{sampleEnum,jdbcType=CHAR}",
        "where sample_id = #{sampleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sample record);
}