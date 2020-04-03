package com.as.error;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMsg;

//通用错误返回方法接口
public interface CommonError {
    public int getErrorCode();
    public String getErrorMsg();
    public CommonError setErrorMsg(String Msg);

}
