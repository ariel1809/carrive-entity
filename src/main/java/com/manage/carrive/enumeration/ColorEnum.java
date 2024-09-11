package com.manage.carrive.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum ColorEnum {
    RED(1),
    BLUE(2),
    GREEN(3),
    BLACK(4),
    WHITE(5),
    PINK(6),
    YELLOW(7);
    private final int color;
}
