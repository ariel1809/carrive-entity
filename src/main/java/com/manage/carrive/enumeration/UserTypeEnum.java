package com.manage.carrive.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum UserTypeEnum {
    ADMIN(1),
    PASSENGER(2),
    DRIVER(3);
    private final Integer userType;
}
