package com.xk.mapper;

import com.xk.pojo.BackendUser;
import org.apache.ibatis.annotations.Mapper;


public interface BackendUserMapper {

    /**
     *  通过账号查询用户信息
     * @param userCode
     * @return
     */
    BackendUser queryUserCode(String userCode);
}
