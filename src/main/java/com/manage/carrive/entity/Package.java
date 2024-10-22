package com.manage.carrive.entity;

import com.manage.carrive.enumeration.PackageEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Getter @Setter
@Document(collection = "packages")
@EqualsAndHashCode
public class Package {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private Double weight;
    @EqualsAndHashCode.Exclude
    private PackageEnum packageType;
    @EqualsAndHashCode.Exclude
    private String picture;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Itinerary itinerary;
}
