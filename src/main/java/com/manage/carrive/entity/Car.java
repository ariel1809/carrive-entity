package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@ToString
@Getter @Setter
@Document(collection = "cars")
@EqualsAndHashCode
public class Car {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private String matriculation;
    @EqualsAndHashCode.Exclude
    private String idCar;
    @EqualsAndHashCode.Exclude
    private String color;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_model")
    private String carModel;
}
