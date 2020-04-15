package com.as.controller;

import com.as.error.EmBusinessError;
import com.as.response.CommonReturnType;
import exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {
    @ExceptionHandler
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public  Object handleException(HttpServletRequest request,Exception ex){
        Map<String,Object> responesData = new HashMap<>();
        if(ex instanceof BusinessException){
            BusinessException businessException =(BusinessException) ex;
            responesData.put("errorCode",businessException.getErrorCode());
            responesData.put("errorMsg",businessException.getErrorMsg());}
//        }else {
//            responesData.put("errorCode", EmBusinessError.UNKNOW_ERROR.getErrorCode());
//            responesData.put("errorMsg",EmBusinessError.UNKNOW_ERROR.getErrorMsg());
//
//        }
        return CommonReturnType.creat(responesData,"fail");
    }
}
