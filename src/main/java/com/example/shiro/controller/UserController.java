package com.example.shiro.controller;

import com.example.shiro.util.ResultMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResultMap test() {
        return resultMap.success().message("您拥有用户权限，可以获得该接口的信息！");
    }
}
