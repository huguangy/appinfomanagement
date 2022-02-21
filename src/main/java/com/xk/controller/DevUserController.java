package com.xk.controller;


import com.xk.pojo.DevUser;
import com.xk.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import java.util.HashMap;

@Controller
@RequestMapping("devUser")
public class DevUserController {


    @Autowired
    private DevUserService devUserService;

    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    public String userLogin(@RequestParam("userCode") String userCode,
                            @RequestParam("userPwd") String userPwd,
                            HttpServletRequest request,
                            Model model){

        DevUser devUser = devUserService.userLogin(userCode, userPwd);

        HttpSession session = request.getSession();
        if(null!=devUser){
            session.setMaxInactiveInterval(60*60*12);
            session.setAttribute("SESSION_DEV_USER",devUser);
            return "developer/appinfolist";
        }else {
            model.addAttribute("error","密码或账号错误");
            return "devlogin";
        }


    }

}
