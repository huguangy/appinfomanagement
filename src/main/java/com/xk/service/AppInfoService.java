package com.xk.service;

import com.xk.pojo.AppInfo;
import com.xk.pojo.AppVersion;

import java.util.List;
import java.util.Map;

public interface AppInfoService {
    List<AppInfo> queryAppInfoList(Map map);

    int queryAppInfoCount(Map map);

    int updateAppInfo(AppInfo appInfo);

    int deleteAppinfo(Integer id);

    int insertAppinfo(AppInfo appInfo);
}
