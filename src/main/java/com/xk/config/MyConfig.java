package com.xk.config;

import com.xk.web.handler.LoginInterceptor;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MyConfig implements WebMvcConfigurer {


//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        //创建拦截器对象
//        LoginInterceptor loginInterceptor = new LoginInterceptor();
//
//        //指定拦截地址
//        String path[]={"/**"};
//        //指定不拦截地址
////        String excludPath[]={"/backendlogin","/devlogin"};
//        String excludPath[]={};
//        registry.addInterceptor(loginInterceptor).addPathPatterns(path).excludePathPatterns(excludPath);
//
//
//    }
}
