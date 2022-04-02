package com.company.service;

import com.company.dto.request.OrderRequest;
import com.company.model.Order;

import java.util.Random;
import java.util.function.Function;

public class OrderService {

    private Order order = null;

    public Function<OrderRequest, Integer> addOrder(OrderRequest request) {
        order =
                new Order(new Random().nextInt(100),
                        request.getCustomerId(), request.getProductId(),
                        request.getQuantity(),
                        request.getPrice(),
                        request.getDate(),
                        request.getStatus());

        return OrderRequest::getCustomerId;
    }

    public Order getOrder() {
        return order;
    }
}
