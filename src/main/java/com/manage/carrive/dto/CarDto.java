package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class CarDto {
    private String matriculation;
    private String idCar;
    private CarDocumentDto carDocument;
    private DriverDto driver;
}
