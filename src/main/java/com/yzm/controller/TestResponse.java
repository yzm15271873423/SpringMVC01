package com.yzm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: yzm
 * @Date: 2021/5/18 - 05 - 18 - 21:41
 * @Description: com.yzm.controller
 * @version: 1.0
 */
@Controller
public class TestResponse {

    @RequestMapping("/testReturnVoid")
    public void testReturnVoid(){
        System.out.println("testReturnVoid ......");
    }


    @RequestMapping("forward")
    public void demo1(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("forward ......");
        //请求转发
        req.getRequestDispatcher("forward.jsp").forward(req,resp);
    }

    @RequestMapping("redirect")
    public void demo2(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("redirect ......");
        //响应重定向
        resp.sendRedirect(req.getContextPath()+"/redirect.jsp");
    }

}
