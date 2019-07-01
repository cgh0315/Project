package com.cgh.first.controller;

import com.cgh.first.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandle {

    @ExceptionHandler(UserNotExistException.class)
    public Map<String,Object> errorJson(Exception e){
        Map<String,Object> map = new HashMap<>();
        map.put("code","userNotExist");
        return map;
    }
}
