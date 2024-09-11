package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class CarDocumentDto {
    private String idCar;
    private Boolean isValid;
    private LocalDateTime sendAt;
    private LocalDateTime validAt;
}
