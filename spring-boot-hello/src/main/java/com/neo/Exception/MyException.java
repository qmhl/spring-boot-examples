package com.neo.Exception;

public class MyException extends RuntimeException {

    private String code;
    private String msg;


    public MyException(String msg) {
        this.msg = msg;
    }

    public MyException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
