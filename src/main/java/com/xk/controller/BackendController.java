package com.xk.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("backend")
public class BackendController {

    @RequestMapping("main")
    public String main(){
        return "backend/main";
    }

    @RequestMapping("appList")
    public String appList(){
        return "backend/applist";
    }
}
