package com.cgh.first.exception;

public class UserNotExistException extends RuntimeException{

    public UserNotExistException(){
        super("用户不存在");
    }
}
