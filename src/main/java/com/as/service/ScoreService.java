package com.as.service;

import com.as.dataobject.ComprehensiveScores;

import java.util.List;

public interface ScoreService {
    List<ComprehensiveScores> selectAllScores();
}
