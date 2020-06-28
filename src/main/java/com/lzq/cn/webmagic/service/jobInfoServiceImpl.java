package com.lzq.cn.webmagic.service;

import com.lzq.cn.webmagic.ben.JobInfo;
import com.lzq.cn.webmagic.dao.JobInfodaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class jobInfoServiceImpl implements jobInfoService {
    @Autowired
    private JobInfodaoImpl jobInfodaoImpl;
    @Override
    public void insert(JobInfo record) {
        jobInfodaoImpl.insert(record);
    }
}
