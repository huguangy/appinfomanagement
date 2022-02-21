package com.xk.mapper;

import com.xk.pojo.AppVersion;

import java.util.List;

public interface AppVersionMapper {

    AppVersion queryVersion_appId(Integer appId);

    List<AppVersion> queryVersionList_appId(Integer appId);

    List<AppVersion> queryVersionList(Integer appId);

    AppVersion queryVersionbyId(Integer id);

    int deleteVersion(Integer appId);

    int insertVersion(AppVersion appVersion);

    int updateVersion(AppVersion appVersion);


}
