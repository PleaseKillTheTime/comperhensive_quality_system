package com.as.response;

public class CommonReturnType {

    //状态 成功或者失败
    private String status;
    //对象 成功时返回json 失败时返回错误信息
    private Object data;

    //公共的创建方法
    public static  CommonReturnType creat(Object result){
        return  CommonReturnType.creat(result,"success");
    }

    public static   CommonReturnType creat(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setStatus(status);
        type.setData(result);
        return  type;
    }

    public CommonReturnType() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
