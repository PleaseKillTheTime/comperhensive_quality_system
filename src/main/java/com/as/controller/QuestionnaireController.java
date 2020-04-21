package com.as.controller;

import com.as.dao.QuestionnaireMapper;
import com.as.dataobject.Questionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuestionnaireController {
    @Autowired
    QuestionnaireMapper questionnaireMapper;
    @RequestMapping("/addQuestionnaire")
    @ResponseBody
    public String addQuestionnaire(@RequestBody Questionnaire questionnaire){
        questionnaireMapper.insert(questionnaire);
        System.out.println(questionnaire.toString());
        return  "success";
    }
    @RequestMapping("/getAllQuestionnaire")
    @ResponseBody
    public List<Questionnaire> getAllQuestionnaire(){
        System.out.println("????????");
        return questionnaireMapper.getAllQuestionnaire();

    }
}
