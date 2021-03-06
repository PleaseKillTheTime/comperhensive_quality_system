package com.as.dao;

import com.as.dataobject.Questionnaire;
import com.as.dataobject.QuestionnaireScores;

import java.util.List;

public interface QuestionnaireMapper {

    int deleteByPrimaryKey(int qid);
    List<Questionnaire> getAllQuestionnaire();

    int insert(Questionnaire record);
    int insertSelective(Questionnaire record);
    Questionnaire selectByPrimaryKey(Integer qid);
    int updateByPrimaryKeySelective(Questionnaire record);
    int updateByPrimaryKey(Questionnaire record);

}