package com.silence.mapper;

import com.silence.po.Series;

public interface SeriesMapper {
    int deleteByPrimaryKey(Integer goodsType);

    int insert(Series record);

    int insertSelective(Series record);

    Series selectByPrimaryKey(Integer goodsType);

    int updateByPrimaryKeySelective(Series record);

    int updateByPrimaryKey(Series record);
}