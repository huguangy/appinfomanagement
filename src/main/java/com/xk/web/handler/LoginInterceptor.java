package com.xk.web.handler;

import com.xk.pojo.BackendUser;
import com.xk.pojo.DevUser;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        BackendUser backendUser = (BackendUser) request.getSession().getAttribute("SESSION_BACKEND_USER");
        DevUser devUser = (DevUser) request.getSession().getAttribute("SESSION_DEV_USER");

        if(null!=backendUser||null!=devUser){
            return true;
        }else {
            response.sendRedirect(request.getContextPath()+"/");
            return false;
        }
    }
}
