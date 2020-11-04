package com.web.controller;

import com.web.bean.User;
import com.web.form.UserForm;
import com.web.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contro")
@Api(value = "登录-接口", tags = {"登录-接口"})
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping ("/logining")
    @ApiOperation(value="登录",notes = "登录")
    public User login(@RequestBody UserForm userform){
        User user= loginService.login(userform);
        return  user;
    }
}
