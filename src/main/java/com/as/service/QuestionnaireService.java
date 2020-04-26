package com.as.service;

import com.as.dataobject.Questionnaire;

import java.util.List;

public interface QuestionnaireService {
    int deleteByPrimaryKey(int qid);
    List<Questionnaire> getAllQuestionnaire();
    int insert(Questionnaire record);
    int insertSelective(Questionnaire record);
    Questionnaire selectByPrimaryKey(Integer qid);
    int updateByPrimaryKeySelective(Questionnaire record);
    int updateByPrimaryKey(Questionnaire record);
}
