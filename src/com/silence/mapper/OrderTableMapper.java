package com.silence.mapper;

import com.silence.po.OrderTable;

public interface OrderTableMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderTable record);

    int insertSelective(OrderTable record);

    OrderTable selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(OrderTable record);

    int updateByPrimaryKey(OrderTable record);
}