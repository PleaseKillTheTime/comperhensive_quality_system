package com.as.service;

import com.as.dao.*;
import com.as.dataobject.ComprehensiveScores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoresServiceImpl implements ScoreService {
    @Autowired
    ComprehensiveScoresMapper comprehensiveScoresMapper;
    @Autowired
    StudyScoresMapper studyScoresMapper;
    @Autowired
    AccessScoresMapper accessScoresMapper;
    @Autowired
    PracticeScoresMapper practiceScoresMappe;
    @Autowired
    StudyScoreDetail2Mapper studyScoreDetail2Mapper;

    public List<ComprehensiveScores> selectAllScores(){
        return comprehensiveScoresMapper.selectAllScores();
    };
}
