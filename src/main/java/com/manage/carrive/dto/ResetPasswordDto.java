package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class ResetPasswordDto {
    private String userMail;
    private Integer code;
    private String newPassword;
    private LocalDateTime resetDate;
    private Boolean isReset;
    private UserCarriveDto user;
}
