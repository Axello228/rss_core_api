package com.axello228.rss_core_api.mapper;

import com.axello228.rss_core_api.dto.OrderDto;
import com.axello228.rss_core_api.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.stream.Collectors;


@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(Order entity);

    Order toEntity(OrderDto dto);

    default List<OrderDto> toDtoList(List<Order> orders) {
        return orders.stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }
}
