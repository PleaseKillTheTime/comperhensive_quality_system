package com.as.service;

import com.as.dao.QuestionnaireMapper;
import com.as.dataobject.Questionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
    @Autowired
    QuestionnaireMapper questionnaireMapper;
    @Override
    public int deleteByPrimaryKey(int qid) {
        return questionnaireMapper.deleteByPrimaryKey(qid);
    }

    @Override
    public List<Questionnaire> getAllQuestionnaire() {
        return questionnaireMapper.getAllQuestionnaire();
    }

    @Override
    public int insert(Questionnaire record) {
        return questionnaireMapper.insert(record);
    }

    @Override
    public int insertSelective(Questionnaire record) {
        return questionnaireMapper.insertSelective(record);
    }

    @Override
    public Questionnaire selectByPrimaryKey(Integer qid) {
        return questionnaireMapper.selectByPrimaryKey(qid);
    }

    @Override
    public int updateByPrimaryKeySelective(Questionnaire record) {
        return questionnaireMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Questionnaire record) {
        return questionnaireMapper.updateByPrimaryKey(record);
    }
}
