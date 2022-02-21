package com.xk.controller;

import com.alibaba.fastjson.JSON;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Appinfo;
import com.xk.pojo.AppInfo;
import com.xk.pojo.AppVersion;
import com.xk.service.AppInfoService;
import com.xk.service.AppVersionService;
import com.xk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("appInfo")
public class AppInfoController {

    @Autowired
    private AppInfoService appInfoService;

    @Autowired
    private AppVersionService appVersionService;


    @RequestMapping(value = "queryAppInfoList" ,method = RequestMethod.POST)
    @ResponseBody
    public String queryAppInfoList(@RequestParam(value = "softwareName",defaultValue = "") String  softwareName,
                                   @RequestParam(value = "flatformId",defaultValue = "0") Integer  flatformId,
                                   @RequestParam(value = "categoryLevel1" ,defaultValue = "0") Integer  categoryLevel1,
                                   @RequestParam(value = "categoryLevel2",defaultValue = "0") Integer  categoryLevel2,
                                   @RequestParam(value = "categoryLevel3" ,defaultValue = "0") Integer  categoryLevel3,
                                   @RequestParam(value = "status",defaultValue = "0") Integer status,
                                   @RequestParam(value = "devId",defaultValue = "0") Integer devId,
                                   @RequestParam(value = "pageNum" ,defaultValue = "1") Integer  pageNum
                                   ){
        HashMap<String, Object> map = new HashMap<>();
        map.put("softwareName",softwareName);
        map.put("flatformId",flatformId);
        map.put("categoryLevel1",categoryLevel1);
        map.put("categoryLevel2",categoryLevel2);
        map.put("categoryLevel3",categoryLevel3);
        map.put("status",status);
        map.put("devId",devId);

        PageUtil<AppInfo> appInfoPageUtil = new PageUtil<>();

        System.out.println("阿斯兰的空间发货大家发哈"+map);
        appInfoPageUtil.setPageSize(7);
        appInfoPageUtil.setSumCount(appInfoService.queryAppInfoCount(map));
        appInfoPageUtil.setPageNum(pageNum);

        map.put("pageNum",(pageNum-1)*appInfoPageUtil.getPageSize());
        map.put("pageSize",appInfoPageUtil.getPageSize());

        appInfoPageUtil.setList(appInfoService.queryAppInfoList(map));

        return JSON.toJSONString(appInfoPageUtil);
    }

    @RequestMapping("appcheck/{id}")
    public String appcheck(@PathVariable Integer id,
                           Model model){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        List<AppInfo> appInfos = appInfoService.queryAppInfoList(map);
        AppInfo appInfo = appInfos.get(0);
        Integer versionId = appInfo.getVersionId();

        model.addAttribute("appinfo",appInfo);
        model.addAttribute("version",appVersionService.queryVersion_appId(id));
        return "backend/appcheck";
    }

    @RequestMapping(value = "updateAppInfo",method = RequestMethod.POST)
    public String updateAppInfo(@ModelAttribute AppInfo appInfo){
        appInfoService.updateAppInfo(appInfo);
        return "backend/applist";
    }

    @RequestMapping(value = "updateAppStatus",method = RequestMethod.POST)
    @ResponseBody
    public String updateAppStatus(@ModelAttribute AppInfo appinfo){
        return JSON.toJSONString(appInfoService.updateAppInfo(appinfo));
    }

    @RequestMapping("appinfomodify.html")
    public String appinfomodify(@RequestParam("id") Integer id,
                                Model model){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        List<AppInfo> appInfos = appInfoService.queryAppInfoList(map);
        AppInfo appInfo=null;
        if(null!=appInfos && !appInfos.isEmpty()){
             appInfo = appInfos.get(0);
        }
        model.addAttribute("appInfo",appInfo);
        return "developer/appinfomodify";
    }

    @RequestMapping(value = "appmodify",method = RequestMethod.POST)
    public String appmodify(@ModelAttribute AppInfo appInfo){
        appInfoService.updateAppInfo(appInfo);
        return "developer/appinfolist";
    }

    @RequestMapping("appinfoview.html")
    public String appinfoview(@RequestParam("id") Integer id,
                              Model model){
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        List<AppInfo> appInfos = appInfoService.queryAppInfoList(map);
        AppInfo appInfo=null;
        if(null!=appInfos && !appInfos.isEmpty()){
            appInfo = appInfos.get(0);
        }
        model.addAttribute("versionList",appVersionService.queryVersionList(id));
        model.addAttribute("appInfo",appInfo);
        return "developer/appinfoview";
    }

    @RequestMapping("appinfoadd.html")
    public String appinfoadd(){
        return "developer/appinfoadd.html";
    }

    @RequestMapping("appAdd")
    public String appAdd(@ModelAttribute AppInfo appInfo){
        appInfoService.insertAppinfo(appInfo);
        return "developer/appinfolist";
    }

    @RequestMapping(value = "deleteAppinfo",method = RequestMethod.POST)
    @ResponseBody
    public String deleteAppinfo(@RequestParam("id") Integer id){
        System.out.println("hahahahah"+id);
        return JSON.toJSONString(appInfoService.deleteAppinfo(id));
    }
}
