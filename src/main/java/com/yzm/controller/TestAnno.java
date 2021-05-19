package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HandlesTypes;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 21:00
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@RestController
public class TestAnno {

    @RequestMapping("/testAnno1")
    public String testParam(@RequestParam("pname") String name, String page){
        System.out.println(name);
        System.out.println(page);
        return "aaa";
    }

    @RequestMapping("/testAnno2")
    public String testHeader(@RequestHeader("Accept") String accept){
        System.out.println(accept);
        return "aaa";
    }

    @RequestMapping("/testAnno3")
    public String testCookie(@CookieValue("JSESSIONID") String jsessionid){
        System.out.println(jsessionid);
        return "aaa";
    }

}
