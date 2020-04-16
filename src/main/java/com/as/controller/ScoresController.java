package com.as.controller;

import com.as.dataobject.ComprehensiveScores;
import com.as.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoresController {
    @Autowired
    ScoreService scoreService;
    @RequestMapping("/AllComprehensiveScore")
    public List<ComprehensiveScores> selectAllScores(){
        return scoreService.selectAllScores();
    }
}
