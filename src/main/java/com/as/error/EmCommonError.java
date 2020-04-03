package com.as.error;

public enum EmCommonError implements CommonError {
    ;

    @Override
    public int getErrorCode() {
        return 0;
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public CommonError setErrorMsg(String Msg) {
        return null;
    }
}

