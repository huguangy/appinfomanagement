package com.xk.service;

import com.xk.pojo.AppVersion;

import java.util.List;

public interface AppVersionService {
    AppVersion queryVersion_appId(Integer appId);

    List<AppVersion> queryVersionList(Integer appId);

    AppVersion queryVersionbyId(Integer id);

    int insertVersion(AppVersion appVersion);

    int updateVersion(AppVersion appVersion);

    int deleteVersion(Integer appId);
}
