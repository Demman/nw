package com.web.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "demo-接口", tags = {"demo-接口"})
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/nw")
    @ApiOperation(value="demo",notes = "demo")
    public  String indexDemo(){
        System.out.println("ok");
        return "/index3";
    }
}
