package com.coocaa.mapper;

import com.coocaa.po.Logdata;

public interface LogdataMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(Logdata record);

    int insertSelective(Logdata record);

    Logdata selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(Logdata record);

    int updateByPrimaryKey(Logdata record);
}