package com.sangkon.api.exceptionhandler;


import com.sangkon.api.exception.CustomException;
import com.sangkon.api.response.CommonResponse;
import com.sangkon.common.enums.CodeEnum;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CustomException.class)
    public CommonResponse handlerCustomExcetpion(CustomException e) {
        return CommonResponse.builder().returnCode(e.getReturnCode()).returnMessage(e.getReturnMessage()).build();
    }

    @ExceptionHandler(Exception.class)
    public CommonResponse handlerException(Exception e) {
        return CommonResponse.builder().returnCode(CodeEnum.UNKNOWN_ERROR.getCode()).returnMessage(CodeEnum.UNKNOWN_ERROR.getMessage()).build();
    }

}
