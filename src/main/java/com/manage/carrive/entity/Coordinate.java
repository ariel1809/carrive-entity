package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
@Document(collection = "coordinates")
@EqualsAndHashCode
public class Coordinate {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private Double longitude;
    @EqualsAndHashCode.Exclude
    private Double latitude;
    @EqualsAndHashCode.Exclude
    @Field(value = "created_at")
    private LocalDateTime createdAt;
}
