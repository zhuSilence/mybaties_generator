package com.silence.mapper;

import com.silence.po.GoodsDetails;

public interface GoodsDetailsMapper {
    int deleteByPrimaryKey(Integer goodsDetailsId);

    int insert(GoodsDetails record);

    int insertSelective(GoodsDetails record);

    GoodsDetails selectByPrimaryKey(Integer goodsDetailsId);

    int updateByPrimaryKeySelective(GoodsDetails record);

    int updateByPrimaryKey(GoodsDetails record);
}