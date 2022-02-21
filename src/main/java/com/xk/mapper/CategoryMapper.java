package com.xk.mapper;

import com.xk.pojo.AppCategory;

import java.util.List;

public interface CategoryMapper {

     List<AppCategory> queryCategoryList(Integer parentId);
}
