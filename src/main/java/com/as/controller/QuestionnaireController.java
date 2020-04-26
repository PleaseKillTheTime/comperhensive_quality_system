package com.as.controller;

import com.as.dao.QuestionnaireDetailMapper;
import com.as.dao.QuestionnaireMapper;
import com.as.dao.QuestionnaireScoresMapper;
import com.as.dao.StudentMapper;
import com.as.dataobject.Questionnaire;
import com.as.dataobject.QuestionnaireDetail;
import com.as.dataobject.QuestionnaireScores;
import com.as.dataobject.Student;
import com.as.response.ReleaseModel;
import com.as.service.StudentService;
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
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    QuestionnaireScoresMapper questionnaireScoresMapper;

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
    public String editQuestionnaireDetail(@RequestBody QuestionnaireDetail questionnaireDetail){
        questionnaireDetailMapper.updateByPrimaryKey(questionnaireDetail);
        System.out.println("修改问卷详情");
        return "success";
    }
    //删除问卷详情
    @RequestMapping("/deleteQuestionnaireDetail")
    @ResponseBody
    public String deleteQuestionnaireDetail(@RequestParam int id){
        questionnaireDetailMapper.deleteByPrimaryKey(id);
        return "success";
    }
    //发布问卷
    @RequestMapping("/releaseQuestionnaire")
    @ResponseBody
    public String ReleaseQuestionnaire(@RequestBody ReleaseModel releaseModel){
        System.out.println(releaseModel.toString());
        List<String> a = studentMapper.selectSidsByMajorAndClazz(releaseModel.getMajor(),releaseModel.getClazz());
        QuestionnaireScores questionnaireScores = new QuestionnaireScores();
        for (String sid :a){
            for (String sid1 :a){
                if (!sid.equals(sid1)) {
                    System.out.println(sid + "====" + sid1);
                    questionnaireScores.setSid(sid);
                    questionnaireScores.setSid1(sid1);
                    questionnaireScores.setDate(releaseModel.getDate());
                    questionnaireScores.setIscomplete("0");
                    questionnaireScores.setQid(releaseModel.getQid());
                    questionnaireScores.setClazz(releaseModel.getClazz());
                    questionnaireScores.setMajor(releaseModel.getMajor());
                    questionnaireScores.setToname(studentMapper.selectNameBySid(sid1));
                    questionnaireScores.setName(studentMapper.selectNameBySid(sid));
                    questionnaireScoresMapper.insert(questionnaireScores);
                }
            }
        }
        return "success";
    }
    //问卷填写情况getAllQuestionnaireScoresBySid
    @RequestMapping("/getAllQuestionnaireScoresBySid")
    @ResponseBody
    public  List<QuestionnaireScores>  getAllQuestionnaireScoresBySid(@RequestParam String sid){
        List<QuestionnaireScores> a = questionnaireScoresMapper.getAllQuestionnaireScoresBySid(sid);
        return a ;
    }
    //问卷填写情况getAllQuestionnaireScoresBySid
    @RequestMapping("/getAllQuestionnaireScores")
    @ResponseBody
    public  List<QuestionnaireScores>  getAllQuestionnaireScores(){
        List<QuestionnaireScores> a = questionnaireScoresMapper.getAllQuestionnaireScores();
        return a ;
    }
    //提交问卷
    @RequestMapping("/commitQuestionnaireScores")
    @ResponseBody
    public  String  commitQuestionnaireScores(@RequestBody QuestionnaireScores questionnaireScores){
      questionnaireScoresMapper.updateByPrimaryKey(questionnaireScores);
        return "success" ;
    }
}
