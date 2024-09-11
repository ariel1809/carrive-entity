package com.manage.carrive.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum CodeResponseEnum {

    CODE_SUCCESS(100),
    CODE_ERROR(101),
    CODE_NULL(102);

    private final Integer code;
}
