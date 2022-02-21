package com.xk.controller;


import com.alibaba.fastjson.JSON;
import com.xk.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("queryDictionary")
    @ResponseBody
    public String queryDictionary(@RequestParam("typeCode") String typeCode){
        return JSON.toJSONString(dictionaryService.queryDictionary(typeCode));
    }
}
