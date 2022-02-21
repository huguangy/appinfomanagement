package com.xk.service.impl;

import com.xk.mapper.DictionaryMapper;
import com.xk.pojo.DataDictionary;
import com.xk.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<DataDictionary> queryDictionary(String typeCode) {

        return dictionaryMapper.queryDictionary(typeCode);
    }
}
