package com.xk.controller;

import com.xk.pojo.BackendUser;
import com.xk.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("backendUser")
public class BackendUserController {

    @Autowired
    private BackendUserService backendUserService;

    @RequestMapping(value = "userLogin",method = RequestMethod.POST)
    public String userLogin(@RequestParam("userCode") String userCode,
                            @RequestParam("userPwd") String userPwd,
                            Model model,
                            HttpServletRequest request){

        BackendUser backendUser = backendUserService.userLogin(userCode, userPwd);
        if(null!=backendUser){
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(60*60*2);
            session.setAttribute("SESSION_BACKEND_USER",backendUser);
            return "backend/applist.html";
        }
        model.addAttribute("error","账号或者密码错误");
        return "backendlogin";

    }
}
