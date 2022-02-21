package com.xk.service.impl;

import com.xk.mapper.DevUserMapper;
import com.xk.pojo.DevUser;
import com.xk.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DevUserServiceImpl implements DevUserService {


    @Autowired
    private DevUserMapper devUserMapper;

    @Override
    public DevUser userLogin(String userCode,String userPwd) {

        DevUser devUser = devUserMapper.userLogin(userCode);
        if(null!=devUser && devUser.getDevPassword().equals(userPwd)){
            return devUser;
        }
        return null;
    }
}
