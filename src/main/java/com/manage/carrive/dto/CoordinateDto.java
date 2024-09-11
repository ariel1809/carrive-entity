package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class CoordinateDto {
    private Double latitude;
    private Double longitude;
    private LocalDateTime createdAt;
}
