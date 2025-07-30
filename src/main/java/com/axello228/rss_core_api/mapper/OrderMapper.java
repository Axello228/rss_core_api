package com.axello228.rss_core_api.mapper;

import com.axello228.rss_core_api.dto.OrderDto;
import com.axello228.rss_core_api.entity.Order;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface OrderMapper {

    OrderDto toDto(Order entity);

    Order toEntity(OrderDto dto);

}
