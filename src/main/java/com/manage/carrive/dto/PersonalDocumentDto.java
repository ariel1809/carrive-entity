package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class PersonalDocumentDto {
    private String driverLicense;
    private String idCard;
    private LocalDateTime sendDate;
}
