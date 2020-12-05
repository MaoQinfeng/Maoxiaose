package com.maoqinfeng.service;

import com.maoqinfeng.pojo.Cart;

public interface OrderService {
    public String createOrder(Cart cart,Integer userId);
}
