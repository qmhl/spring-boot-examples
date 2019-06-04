package com.neo.Exception;

import java.util.Map;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private IErrorCode iErrorCode;

    private String errorCode;
    private String errorMessage;
    private Map<String, Object> errorData;

    public BusinessException(IErrorCode iErrorCode) {
        super();
        this.iErrorCode = iErrorCode;
        this.errorCode = iErrorCode.getErrorCode();
        this.errorMessage = iErrorCode.getErrorMessage();
    }

    public BusinessException(String message, IErrorCode iErrorCode) {
        super(message);
        this.iErrorCode = iErrorCode;
    }


//    if(true){
//        throw new BusinessException(SysErrorEnums.EMPTY_OBJ);
//    }
}
