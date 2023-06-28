package com.auto.exception;

/**
 * 业务异常处理
 */
public class BusinessLogicException extends RuntimeException{

    private int code;

    public BusinessLogicException() {
    }

    public BusinessLogicException(String message, int code) {
        super(message);
        this.code = code;
    }

    public void businessLogicException(){

    }

    public String businessLogicException(String message){
        return message;
    }
}
