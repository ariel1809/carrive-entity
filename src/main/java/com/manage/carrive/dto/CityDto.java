package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class CityDto {
    private String cityName;
    private LocalDateTime createdAt;
}
