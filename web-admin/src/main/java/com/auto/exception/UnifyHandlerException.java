package com.auto.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UnifyHandlerException {

    /**
     * 统一业务异常
     * @param message
     * @return
     */
    @ExceptionHandler(BusinessLogicException.class)
    public String businessLogicException(String message){
        return message;
    }

    @ExceptionHandler(Exception.class)
    public String systemHandlerException(String message){
        return message;
    }
}
