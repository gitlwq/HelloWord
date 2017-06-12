package com.lwq.springboot.com.lwq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Created by wqli on 2017/6/8.
 */

/**
 * demo controller
 */
@Controller
public class DemoIndex {

    /**
     * home
     */
    @RequestMapping("/")
    @ResponseBody
    public String  home (){
        System.out.print("Hello Word");
        return  "Hello";
    }
}
