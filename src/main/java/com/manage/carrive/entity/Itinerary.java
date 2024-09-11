package com.manage.carrive.entity;

import com.manage.carrive.enumeration.StatusItineraryEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@ToString
@Getter @Setter
@Document(collection = "itineraries")
@EqualsAndHashCode(callSuper = true)
public class Itinerary extends UserCarrive{
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "start_date")
    private LocalDate startDate;
    @EqualsAndHashCode.Exclude
    @Field(value = "start_time")
    private LocalTime startTime;
    @EqualsAndHashCode.Exclude
    private Double tariff;
    @EqualsAndHashCode.Exclude
    @Field(value = "start_city")
    @DBRef
    private City startCity;
    @EqualsAndHashCode.Exclude
    @Field(value = "destination_city")
    @DBRef
    private City destinationCity;
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
    private Boolean acceptedPackage;
    @EqualsAndHashCode.Exclude
    @Field(value = "created_by")
    private Driver createdBy;
}
