package com.axello228.rss_core_api.repository;

import com.axello228.rss_core_api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
