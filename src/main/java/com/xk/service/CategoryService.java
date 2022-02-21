package com.xk.service;

import com.xk.pojo.AppCategory;

import java.util.List;

public interface CategoryService {

    List<AppCategory> queryCategoryList(Integer parentId);
}
