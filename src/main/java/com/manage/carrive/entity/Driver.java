package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@Getter @Setter
@Document(collection = "drivers")
@EqualsAndHashCode(callSuper = true)
public class Driver extends UserCarrive{
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @DBRef
    private List<Car> cars = new ArrayList<>();
    @EqualsAndHashCode.Exclude
    @DBRef
    private List<Itinerary> itineraries = new ArrayList<>();
}
