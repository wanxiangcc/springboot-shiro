package com.example.shiro.controller;

import com.example.shiro.util.ResultMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.security.auth.login.AccountException;

/**
 * 异常捕获advice
 */
@RestControllerAdvice
public class ExceptionController extends BaseController {
    /**
     * 捕捉 CustomRealm 抛出的异常
     */
    @ExceptionHandler(AccountException.class)
    public ResultMap handleShiroException(Exception ex) {
        return resultMap.fail().message(ex.getMessage());
    }
}
