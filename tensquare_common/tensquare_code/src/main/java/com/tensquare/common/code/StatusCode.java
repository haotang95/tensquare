package com.tensquare.common.code;

public enum StatusCode {

    SUCCESS(200, "成功"),

    ERROR(4001, "系统错误"),

    REPERROR(4002, "重复操作");

    private int code;

    private String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
