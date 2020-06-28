package com.lzq.cn.webmagic.ben;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobInfo {

    private Integer id;

    private String position;

    private String company;

    private String city;

    private Integer wages;

    private String date;
}