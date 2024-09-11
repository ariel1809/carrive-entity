package com.manage.carrive.dto;

import com.manage.carrive.enumeration.UserTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class UserCarriveDto {
    private String name;
    private String email;
    private String password;
    private String token;
    private Boolean isActive;
    private Boolean isConnected;
    private LocalDateTime registerAt;
    private UserTypeEnum userType;

}
