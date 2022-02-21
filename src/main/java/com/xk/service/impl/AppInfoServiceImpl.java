package com.xk.service.impl;

import com.xk.mapper.AppInfoMapper;
import com.xk.mapper.AppVersionMapper;
import com.xk.pojo.AppInfo;
import com.xk.pojo.AppVersion;
import com.xk.service.AppInfoService;
import com.xk.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AppInfoServiceImpl implements AppInfoService {

    @Autowired
    private AppInfoMapper appInfoMapper;

    @Autowired
    private AppVersionService appVersionService;

    @Override
    public List<AppInfo> queryAppInfoList(Map map) {
        return appInfoMapper.queryAppInfoList(map);
    }

    @Override
    public int queryAppInfoCount(Map map) {
        return appInfoMapper.queryAppInfoCount(map);
    }

    @Override
    public int updateAppInfo(AppInfo appInfo) {
        return appInfoMapper.updateAppInfo(appInfo);
    }

    @Override
    @Transactional
    public int deleteAppinfo(Integer id) {

        //判断版本表中是否存在app的版本信息，如果存在
        List<AppVersion> appVersions = appVersionService.queryVersionList(id);
        if(!appVersions.isEmpty() && null!=appVersions){
            //删除版本信息
            int row = appVersionService.deleteVersion(id);
            //删除成功
            if(row>=1){
                //删除app信息
                appInfoMapper.deleteAppinfo(id);
            }
        }else {//不存在版本信息，则直接删除app信息
             appInfoMapper.deleteAppinfo(id);
        }
        return 0;
    }

    @Override
    public int insertAppinfo(AppInfo appInfo) {
        return appInfoMapper.insertAppinfo(appInfo);
    }
}
