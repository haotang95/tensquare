package com.tensquare.base.controller;

import com.tensquare.common.code.ResultData;
import com.tensquare.common.code.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName BaseExceptionHandler
 * @auther tangh
 * @date 2019/1/9 0009 9:02
 */
@ControllerAdvice
public class BaseExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultData globalException(Exception e){
        e.printStackTrace();
        return new ResultData(false, StatusCode.ERROR.getCode(), StatusCode.ERROR.getMsg(), e.getMessage());
    }
}
