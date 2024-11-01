package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class StatDriver {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private Integer cars;
    @EqualsAndHashCode.Exclude
    private Double rating;
    @EqualsAndHashCode.Exclude
    private Integer rides;
}
