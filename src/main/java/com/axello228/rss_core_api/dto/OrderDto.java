package com.axello228.rss_core_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class OrderDto {

    private Long id;
    private String customerName;
    private String phoneNumber;
    private LocalDateTime orderDate;

}
