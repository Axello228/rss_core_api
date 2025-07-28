package com.axello228.rss_core_api.service;

import com.axello228.rss_core_api.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getAllOrders();
    void createOrder(OrderDto orderDto);
}