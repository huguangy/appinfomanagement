package com.xk.controller;

import com.alibaba.fastjson.JSON;
import com.xk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("queryCategoryList")
    @ResponseBody
    public String queryCategoryList(@RequestParam("parentId") Integer parentId){
        return JSON.toJSONString(categoryService.queryCategoryList(parentId));
    }

}
