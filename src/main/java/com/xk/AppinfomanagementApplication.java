package com.xk;

import com.xk.web.handler.LoginInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 是springboot的核心注解，是一个组合注解，该注解结合了
 * @Configuration:用于定义 配置类--可以替换xml文件一般和@Bean结合使用
 * @EnableAutoConfiguration：是让springboot根据路径中的jar包依赖为当前项目进行自动配置，
 * @ComponentScan：该类会默认扫描该类所有包下的所有的配置类
 */
@SpringBootApplication
@MapperScan("com.xk.mapper")
public class AppinfomanagementApplication implements WebMvcConfigurer {


    public static void main(String[] args) {
        SpringApplication.run(AppinfomanagementApplication.class, args);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //创建拦截器对象
        LoginInterceptor loginInterceptor = new LoginInterceptor();

        //指定拦截地址
        String path[]={"/**"};
        //指定不拦截地址
        String excludPath[]={"/backendlogin.html","/devlogin.html","/devUser/userLogin","/backendUser/userLogin","/","/static/**"};
//        String excludPath[]={};
        registry.addInterceptor(loginInterceptor).addPathPatterns(path).excludePathPatterns(excludPath);
    }
}
