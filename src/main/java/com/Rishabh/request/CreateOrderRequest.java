package com.Rishabh.request;

import com.Rishabh.domain.OrderType;

import lombok.Data;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
