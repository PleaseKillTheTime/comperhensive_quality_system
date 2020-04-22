package com.as.controller;

import com.as.dao.QuestionnaireDetailMapper;
import com.as.dao.QuestionnaireMapper;
import com.as.dataobject.Questionnaire;
import com.as.dataobject.QuestionnaireDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class QuestionnaireController {
    @Autowired
    QuestionnaireMapper questionnaireMapper;
    @Autowired
    QuestionnaireDetailMapper questionnaireDetailMapper;
    //新增问卷
    @RequestMapping("/addQuestionnaire")
    @ResponseBody
    public String addQuestionnaire(@RequestBody Questionnaire questionnaire){
        questionnaireMapper.insert(questionnaire);
        System.out.println(questionnaire.toString());
        return  "success";
    }
    //获取所有问卷
    @RequestMapping("/getAllQuestionnaire")
    @ResponseBody
    public List<Questionnaire> getAllQuestionnaire(){
        System.out.println("获取全部问卷");
        return questionnaireMapper.getAllQuestionnaire();
    }
    //删除问卷
    @RequestMapping("/deleteQuestionnaire")
    @ResponseBody
    public String getAllQuestionnaire(@RequestParam int qid){
        questionnaireMapper.deleteByPrimaryKey(qid);
        return "success";
    }
    //编辑问卷
    @RequestMapping("/editQuestionnaire")
    @ResponseBody
    public String editQuestionnaire(@RequestBody  Questionnaire questionnaire){
        questionnaireMapper.updateByPrimaryKey(questionnaire);
        return "success";
    }
    //根据ID 获取问卷
    @RequestMapping("/selectQuestionnaireById")
    @ResponseBody
    public Questionnaire selectQuestionnaireById(@RequestParam  int id){
        return questionnaireMapper.selectByPrimaryKey(id);

    }
    @RequestMapping("/getAllQuestionnaireDetail")
    @ResponseBody
    public List<QuestionnaireDetail> getAllQuestionnaireDetail(){
        System.out.println("获取全部问卷详情");
        return questionnaireDetailMapper.getAllQuestionnaireDetail();
    }
    //根据ID获取问卷详情
    @RequestMapping("/getAllQuestionnaireDetailById")
    @ResponseBody
    public List<QuestionnaireDetail> getAllQuestionnaireDetailById(@RequestParam int qid){
        System.out.println("根据ID获取问卷详情");
        return questionnaireDetailMapper.getQuestionnaireDetailById(qid);
    }
    //新增问卷详情
    @RequestMapping("/addQuestionnaireDetail")
    @ResponseBody
    public String addQuestionnaireDetail(@RequestBody QuestionnaireDetail questionnaireDetail){
        questionnaireDetailMapper.insert(questionnaireDetail);
        return  "success";
    }
    //修改问卷详情
    @RequestMapping("/editQuestionnaireDetail")
    @ResponseBody
    public String editQuestionnaireDetail(@RequestParam QuestionnaireDetail questionnaireDetail){
        questionnaireDetailMapper.updateByPrimaryKey(questionnaireDetail);
        return "success";
    }
    //删除问卷详情
    @RequestMapping("/deleteQuestionnaireDetail")
    @ResponseBody
    public String deleteQuestionnaireDetail(@RequestParam int id){
        questionnaireDetailMapper.deleteByPrimaryKey(id);
        return "success";
    }
}
