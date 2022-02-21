package com.xk.service.impl;

import com.xk.mapper.BackendUserMapper;
import com.xk.pojo.BackendUser;
import com.xk.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BackendUserServiceImpl implements BackendUserService {

    @Autowired
    private BackendUserMapper backendUserMapper;

    /**
     * 通过用户账号和密码查询用户对象
     * @param userCode
     * @return
     */
    @Override
    public BackendUser userLogin(String userCode,String userPwd) {
        BackendUser user = backendUserMapper.queryUserCode(userCode);
        if(null!=user && user.getUserPassword().equals(userPwd)){
            return user;
        }
        return null;
    }
}
