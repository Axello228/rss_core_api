package com.axello228.rss_core_api.service;

import com.axello228.rss_core_api.dto.OrderDto;
import com.axello228.rss_core_api.entity.Order;
import com.axello228.rss_core_api.mapper.OrderMapper;
import com.axello228.rss_core_api.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepo.findAll();
        return orderMapper.toDtoList(orders);
    }

    @Override
    public void createOrder(OrderDto orderDto) {
        Order order = orderMapper.toEntity(orderDto);
        order.setName(orderDto.getName());
        order.setPhone(orderDto.getPhone());
        order.setDate(LocalDateTime.now());
        orderRepo.save(order);
    }
}
