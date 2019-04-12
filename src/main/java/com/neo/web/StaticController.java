package com.neo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 该类下访问页面将不会被shiro拦截
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/static")
public class StaticController {
   
    /**
     * 用户注册
     * 
     */
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

}