package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: yzm
 * @Date: 2021/5/17 - 05 - 17 - 11:38
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class FirstController {

    @RequestMapping("/firstServlet.do")
    public String firstServlet(){
        System.out.println("firstServlet invoked ... ...");
        return "first.jsp";
    }

    @RequestMapping(value = "/testController.do",method = RequestMethod.GET)
    public String testController(){
        System.out.println("testController .....");
        return "logo.jsp";
    }

    @RequestMapping(value = "/testController2.do",params = "uname")
    public String testController2(){
        System.out.println("testController2 .....");
        return "logo.jsp";
    }

    @RequestMapping(value = "/testController3.do",headers = "Accept-Encoding=gzip, deflate, br")
    public String testController3(){
        System.out.println("testController3 .....");
        return "logo.jsp";
    }

}
