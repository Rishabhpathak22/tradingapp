package com.Rishabh.service;

import com.Rishabh.domain.OrderType;
import com.Rishabh.model.Coin;
import com.Rishabh.model.Order;
import com.Rishabh.model.OrderItem;
import com.Rishabh.model.User;


import java.util.List;

public interface OrderService {

    Order createOrder(User user, OrderItem orderItem, OrderType orderType);

    Order getOrderById(Long orderId);

    List<Order> getAllOrdersForUser(Long userId, String orderType,String assetSymbol);

    void cancelOrder(Long orderId);

//    Order buyAsset(CreateOrderRequest req, Long userId, String jwt) throws Exception;

    Order processOrder(Coin coin, double quantity, OrderType orderType, User user) throws Exception;

//    Order sellAsset(CreateOrderRequest req,Long userId,String jwt) throws Exception;


}
