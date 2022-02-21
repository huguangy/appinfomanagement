package com.xk.controller;


import com.alibaba.fastjson.JSON;
import com.xk.pojo.AppVersion;
import com.xk.pojo.DevUser;
import com.xk.service.AppVersionService;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("appVersion")
public class AppVersionController {

    @Autowired
    private AppVersionService appVersionService;

    @RequestMapping("appversionadd/{id}")
    public String appversionadd(@PathVariable Integer id,
                                Model model){
        List<AppVersion> appVersions = appVersionService.queryVersionList(id);
        model.addAttribute("versionList",appVersions);
        model.addAttribute("appid",id);
        System.out.println(appVersions);
        return "developer/appversionadd";
    }

    @RequestMapping(value = "queryVersion",method = RequestMethod.POST)
    @ResponseBody
    public String queryVersion(@RequestParam("id") Integer id){

        return JSON.toJSONString(appVersionService.queryVersionbyId(id));
    }

    @RequestMapping("addVersion")
    public String addVersion(@ModelAttribute AppVersion appVersion,
                             @RequestParam("file") MultipartFile file,
                             Model model,
                             HttpServletRequest request){
        if(!file.isEmpty()){
            String fileName = UUID.randomUUID().toString().replace("-", "") + "." + FilenameUtils.getExtension(file.getOriginalFilename());
            String filePath="D:\\idea\\IdeaProjects\\appinfomanagement\\src\\main\\resources\\static\\uploadfiles";
            try {
                file.transferTo(new File(filePath+fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            appVersion.setApkFileName(fileName);
            appVersion.setApkLocPath(filePath+fileName);
            appVersion.setDownloadLink(filePath+fileName);
            appVersion.setCreatedBy((((DevUser)request.getSession().getAttribute("SESSION_DEV_USER")).getId()));
            appVersionService.insertVersion(appVersion);
            return "developer/appinfolist";
        }else{
            model.addAttribute("appId",appVersionService.queryVersionList(appVersion.getAppId()));
            return "developer/appversionadd";
        }

    }

    @RequestMapping("updateVersion")
    public String updateVersion(@ModelAttribute AppVersion appVersion,
                             @RequestParam("file") MultipartFile file,
                             HttpServletRequest request){
        if(!file.isEmpty()){
            String fileName = UUID.randomUUID().toString().replace("-", "") + "." + FilenameUtils.getExtension(file.getOriginalFilename());
            String filePath="D:\\idea\\IdeaProjects\\appinfomanagement\\src\\main\\resources\\static\\uploadfiles";
            try {
                file.transferTo(new File(filePath+fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
            appVersion.setApkFileName(fileName);
            appVersion.setApkLocPath(filePath+fileName);
            appVersion.setDownloadLink(filePath+fileName);
            appVersion.setCreatedBy((((DevUser)request.getSession().getAttribute("SESSION_DEV_USER")).getId()));
            appVersionService.updateVersion(appVersion);
        }else{
            appVersionService.updateVersion(appVersion);
        }
        return "developer/appinfolist";
    }

}
