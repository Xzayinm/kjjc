package com.ljn.dao;

import com.ljn.domain.Orders;

import java.util.List;

public interface OrderDao {
    //查询所有订单
    public List<Orders> getAllOrders();
}
