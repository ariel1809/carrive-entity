package com.manage.carrive.dto;

import com.manage.carrive.enumeration.ColorEnum;
import com.manage.carrive.enumeration.UserTypeEnum;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
public class UserRegister {
    private String name;
    private String email;
    private String password;
    private String confirmPassword;
    private UserTypeEnum userType;
    private String color;
    private String matriculation;
    private String idCar;
    private String carBrand;
}
