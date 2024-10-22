package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
@Document(collection = "cities")
@EqualsAndHashCode
public class City {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "city_name")
    private String cityName;
    @Field(value = "created_at")
    private LocalDateTime createdAt;
}
