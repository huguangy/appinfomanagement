package com.xk.mapper;

import com.xk.pojo.DataDictionary;

import java.util.List;

public interface DictionaryMapper {

    List<DataDictionary> queryDictionary(String typeCode);
}
