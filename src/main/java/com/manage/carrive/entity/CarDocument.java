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
@Document(collection = "car_documents")
@EqualsAndHashCode
public class CarDocument {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private String idCar;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_valid")
    private Boolean isValid = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_at")
    private LocalDateTime sendAt;
    @EqualsAndHashCode.Exclude
    @Field(value = "valid_at")
    private LocalDateTime validAt;
}
