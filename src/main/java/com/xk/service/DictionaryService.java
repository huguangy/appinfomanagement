package com.xk.service;

import com.xk.pojo.DataDictionary;

import java.util.List;

public interface DictionaryService {

    List<DataDictionary> queryDictionary(String typeCode);
}
