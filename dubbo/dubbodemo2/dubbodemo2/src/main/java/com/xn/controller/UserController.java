package com.xn.controller;

import com.xn.config.ResponseData;
import com.xn.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Administrator on 2018/9/29.
 */
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private DemoService demoService;

//    public DemoService getDemoService() {
//        return demoService;
//    }
//
//    public void setDemoService(DemoService demoService) {
//        this.demoService = demoService;
//    }

    @RequestMapping("/getList")
    public ResponseData getList() {
        String hello = demoService.sayHello("tom");
        System.out.println(hello);
        return ResponseData.ok().putDataValue("aa",hello);
    }
}
