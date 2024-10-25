package com.manage.carrive.entity;

import com.manage.carrive.enumeration.StatusItineraryEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@ToString
@Getter @Setter
@Document(collection = "itineraries")
public class Itinerary{
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Field(value = "start_date")
    private LocalDate startDate;
    @EqualsAndHashCode.Exclude
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @Field(value = "start_time")
    private LocalTime startTime;
    @EqualsAndHashCode.Exclude
    private Double tariff;
    @EqualsAndHashCode.Exclude
    @Field(value = "start_city")
    private String startCity;
    @EqualsAndHashCode.Exclude
    @Field(value = "destination_city")
    private String destinationCity;
    @EqualsAndHashCode.Exclude
    @Field(value = "created_at")
    private LocalDateTime createdAt;
    @EqualsAndHashCode.Exclude
    private Integer capacity;
    @EqualsAndHashCode.Exclude
    private Double distance;
    @EqualsAndHashCode.Exclude
    private StatusItineraryEnum status;
    @EqualsAndHashCode.Exclude
    @Field(value = "accepted_package")
    private Boolean acceptedPackage = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "created_by")
    private Driver createdBy;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_published")
    private Boolean isPublished = Boolean.FALSE;
}
