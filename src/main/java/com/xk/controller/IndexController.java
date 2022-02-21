package com.xk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

    @RequestMapping(value = "index.html",method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @RequestMapping("backendlogin.html")
    public String backendlogin(){
        return "backendlogin";
    }

    @RequestMapping("devlogin.html")
    public String devlogin(){
        return "devlogin";
    }



}
