package com.axello228.rss_core_api.controller;


import com.axello228.rss_core_api.dto.OrderDto;
import com.axello228.rss_core_api.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.axello228.rss_core_api.controller.OrderController.PATH;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(PATH)
public class OrderController {
    public static final String PATH = "/orders";
    @Autowired
    private OrderService orderService;

    @PostMapping()
    void createOrder(@RequestBody OrderDto orderDto) {
        orderService.createOrder(orderDto);
    }
}
