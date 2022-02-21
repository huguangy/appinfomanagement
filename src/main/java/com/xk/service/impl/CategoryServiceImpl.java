package com.xk.service.impl;

import com.xk.mapper.CategoryMapper;
import com.xk.pojo.AppCategory;
import com.xk.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<AppCategory> queryCategoryList(Integer parentId) {
        return categoryMapper.queryCategoryList(parentId);
    }
}
