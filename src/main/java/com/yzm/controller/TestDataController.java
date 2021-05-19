package com.yzm.controller;

import com.yzm.pojo.Person;
import com.yzm.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 15:10
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class TestDataController {

    @RequestMapping("/getParam1.do")
    public String getParam1(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String uname = httpServletRequest.getParameter("uname");
        String pwd = httpServletRequest.getParameter("password");
        System.out.println("username:"+uname);
        System.out.println("password:"+pwd);
        return "/logo";
    }

    @RequestMapping("/getParam2.do")
    public String getParam2(String uname,@RequestParam("password") String pwd){
        System.out.println("username:"+uname);
        System.out.println("password:"+pwd);
        return "/logo";
    }

    @RequestMapping("/getParam3.do")
    public String getParam3(Person p){
        System.out.println(p);
        return "/logo";
    }




}
