package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.time.LocalTime;

@ToString
@Getter @Setter
public class RegisterCodeDto {
    private Integer code;
    private LocalDateTime expirationDate;
    private Boolean isOk;
    private UserCarriveDto user;
}
