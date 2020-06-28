package com.lzq.cn.webmagic.dao;

import com.lzq.cn.webmagic.ben.JobInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobInfodaoImpl implements jobInfodao{
    @Autowired
    private JobInfoMapper jobInfoMapper;
    @Override
    public void insert(JobInfo record) {
        jobInfoMapper.insert(record);
    }
}
