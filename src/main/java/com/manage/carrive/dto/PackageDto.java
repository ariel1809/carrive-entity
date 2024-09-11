package com.manage.carrive.dto;

import com.manage.carrive.enumeration.PackageEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class PackageDto {
    private Double weight;
    private PackageEnum packageType;
    private String picture;
}
