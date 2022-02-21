package com.xk.service;

import com.xk.pojo.BackendUser;

public interface BackendUserService {

    public BackendUser userLogin(String userCode,String userPwd);
}
