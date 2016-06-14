package com.v5zhu.open.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhuxl@paxsz.com on 2016/6/7.
 */
@org.springframework.stereotype.Controller
@EnableAutoConfiguration
public class Controller {
    @ResponseBody
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Controller.class,args);
    }
}
