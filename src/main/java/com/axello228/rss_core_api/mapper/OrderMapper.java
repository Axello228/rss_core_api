package com.axello228.rss_core_api.mapper;

import org.mapstruct.Mapper;
import com.axello228.rss_core_api.entity.Order;
import com.axello228.rss_core_api.dto.OrderDto;

@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(Order entity);

    Order toEntity(OrderDto dto);
}
