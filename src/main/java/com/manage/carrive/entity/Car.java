package com.manage.carrive.entity;

import com.manage.carrive.enumeration.ColorEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
    @DBRef
    @Field(value = "car_document")
    private CarDocument carDocument;
    @EqualsAndHashCode.Exclude
    private String idCar;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Driver driver;
    @EqualsAndHashCode.Exclude
    private ColorEnum color;
}
