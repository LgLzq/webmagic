package com.lzq.cn.webmagic.dao;

import com.lzq.cn.webmagic.ben.JobInfo;
import org.springframework.stereotype.Component;

@Component
public interface JobInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobInfo record);

    int insertSelective(JobInfo record);

    JobInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobInfo record);

    int updateByPrimaryKey(JobInfo record);
}