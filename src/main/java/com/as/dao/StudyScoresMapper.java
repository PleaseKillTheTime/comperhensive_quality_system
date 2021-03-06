package com.as.dao;

import com.as.dataobject.StudyScores;
import com.as.dataobject.StudyScoresKey;

public interface StudyScoresMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    int deleteByPrimaryKey(StudyScoresKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    int insert(StudyScores record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    int insertSelective(StudyScores record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    StudyScores selectByPrimaryKey(StudyScoresKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    int updateByPrimaryKeySelective(StudyScores record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table studyscores
     *
     * @mbg.generated Mon Apr 20 13:21:32 CST 2020
     */
    int updateByPrimaryKey(StudyScores record);
}