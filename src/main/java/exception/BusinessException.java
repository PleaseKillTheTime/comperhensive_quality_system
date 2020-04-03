package exception;

import com.as.error.CommonError;
/*
包装器业务异常类实现
 */
public class BusinessException extends Exception implements CommonError {
    //与枚举的EmBusinessError 关联
    private  CommonError commonError;
    //构造方法
    public BusinessException(CommonError commonError) {
        this.commonError = commonError;
    }
    public BusinessException(CommonError commonError,String msg) {
        this.commonError = commonError;
        this.commonError.setErrorMsg(msg);
    }


    @Override
    public int getErrorCode() {
        return this.commonError.getErrorCode();
    }

    @Override
    public String getErrorMsg() {
        return  this.commonError.getErrorMsg();
    }

    @Override
    public CommonError setErrorMsg(String msg) {
        this.commonError.setErrorMsg(msg);
        return this;
    }
}
