package com.xk.service.impl;

import com.xk.mapper.AppVersionMapper;
import com.xk.pojo.AppInfo;
import com.xk.pojo.AppVersion;
import com.xk.service.AppInfoService;
import com.xk.service.AppVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class AppVersionServiceImpl implements AppVersionService {

    @Autowired
    private AppVersionMapper appVersionMapper;

    @Autowired
    private AppInfoService appInfoService;

    @Override
    public AppVersion queryVersion_appId(Integer appId) {
        return appVersionMapper.queryVersion_appId(appId);
    }


    @Override
    public List<AppVersion> queryVersionList(Integer appId) {
        return appVersionMapper.queryVersionList(appId);
    }

    @Override
    public AppVersion queryVersionbyId(Integer id) {
        return appVersionMapper.queryVersionbyId(id);
    }

    @Override
    @Transactional
    public int insertVersion(AppVersion appVersion) {
        //添加新的版本信息
        int row = appVersionMapper.insertVersion(appVersion);

        //查找出新添加的版本信息
        AppVersion appVersion1 = appVersionMapper.queryVersionList_appId(appVersion.getAppId()).get(0);

        if (row>=1){
            //更新主表中新版本信息
            HashMap<String, Object> map = new HashMap<>();
            map.put("id",appVersion.getAppId());
            List<AppInfo> appInfos = appInfoService.queryAppInfoList(map);
            AppInfo appInfo = appInfos.get(0);
            appInfo.setVersionId(appVersion1.getId());
            appInfoService.updateAppInfo(appInfo);
        }
        return row;
    }

    @Override
    public int updateVersion(AppVersion appVersion) {

        return appVersionMapper.updateVersion(appVersion);
    }

    @Override
    public int deleteVersion(Integer appId) {
        return appVersionMapper.deleteVersion(appId);
    }
}
