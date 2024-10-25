package com.manage.carrive.dto;

import com.manage.carrive.enumeration.StatusItineraryEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@ToString
@Getter @Setter
public class ItineraryDto {
    private LocalDate startDate;
    private LocalTime startTime;
    private Double tariff;
    private String startCity;
    private String destinationCity;
    private LocalDateTime createdAt;
    private Integer capacity;
    private Double distance;
    private StatusItineraryEnum status;
    private Boolean acceptedPackage;
    private DriverDto driver;
    private Boolean isPublished = false;
}
