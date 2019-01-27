package com.example.shiro.controller;

import com.example.shiro.util.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guest")
public class GuestController extends BaseController {
    @RequestMapping(value = "/enter", method = RequestMethod.GET)
    public ResultMap login() {
        return resultMap.success().message("欢迎进入，您的身份是游客");
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResultMap test() {
        return resultMap.success().message("您拥有获得guest该接口的信息的权限！");
    }
}
