package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString(callSuper = true)
@Getter @Setter
@Document(collection = "passengers")
@EqualsAndHashCode(callSuper = true)
public class Passenger extends UserCarrive{
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Package pack;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Itinerary itinerary;
}
