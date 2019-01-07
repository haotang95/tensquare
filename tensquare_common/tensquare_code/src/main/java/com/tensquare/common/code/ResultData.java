package com.tensquare.common.code;

/**
 * @auther tangh
 * @date 2019/1/5 0005 11:56
 */
public class ResultData {

    private boolean flag;//是否成功
    private Integer code;//返回码
    private String message;//返回信息
    private Object data;//返回数据

    public ResultData(boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
