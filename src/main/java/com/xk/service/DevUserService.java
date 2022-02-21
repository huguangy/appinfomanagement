package com.xk.service;


import com.xk.pojo.DevUser;

public interface DevUserService {
    DevUser userLogin(String userCode,String userPwd);
}
