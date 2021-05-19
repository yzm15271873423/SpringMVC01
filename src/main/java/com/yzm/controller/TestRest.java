package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 16:49
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@RestController
public class TestRest {

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    public String testPut(@PathVariable(value = "id") Integer id){
        System.out.println("testPut, id:"+id);
        return "/aaa";
    }
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    public String testDelete(@PathVariable(value = "id") Integer id){
        System.out.println("testDelete, id:"+id);
        return "/aaa";
    }
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.POST)
    public String testPOST(@PathVariable(value = "id") Integer id){
        System.out.println("testPOST, id:"+id);
        return "/aaa";
    }
    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testGET(@PathVariable(value = "id") Integer id) {
        System.out.println("testGET, id:" + id);
        return "/aaa";
    }

    @RequestMapping("/testPathVariable")
    public String testPathVariable(){

        System.out.println("testPathVariable1");
        return "/logo";
    }

}
