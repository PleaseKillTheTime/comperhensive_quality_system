package com.as.error;

public enum EmBusinessError implements CommonError {
    PARAMETER_VALIDATION_ERROR(40001,"参数不合法"),
    UNKNOW_ERROR(10002,"未知错误"),
    USER_LOGIN_FAIL(01,"密码或用户名错误"),
    USER_NOT_EXIT(10001,"用户不存在");

    private int errorCode;
    private String errorMsg;

    EmBusinessError(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    @Override
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getErrorMsg() {
        return errorMsg;
    }

    @Override
    public CommonError setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
}
