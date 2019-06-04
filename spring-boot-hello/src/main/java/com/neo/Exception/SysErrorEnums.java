package com.neo.Exception;

public enum SysErrorEnums implements  IErrorCode {


    /**参数为空*/
    EMPTY_PARAME("A11002","参数为空"),
    /**参数错误*/
    ERROR_PARAME("A11002","参数错误");

    private String errorCode;
    private String errorMessage;

    SysErrorEnums(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String getErrorCode() {
        return null;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }
}
