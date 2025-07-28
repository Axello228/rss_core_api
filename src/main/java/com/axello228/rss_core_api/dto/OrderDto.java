package com.axello228.rss_core_api.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrderDto {

    private Long id;
    private String name;
    private String phone;
    private LocalDateTime date;

}
