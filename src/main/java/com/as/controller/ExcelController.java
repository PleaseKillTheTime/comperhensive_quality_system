package com.as.controller;

import com.as.response.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ExcelController {
    @RequestMapping("/importExcel")
    @ResponseBody
    public CommonReturnType importExcel(MultipartFile file){
        System.out.println(file);
    return CommonReturnType.creat(null);
    }
}
