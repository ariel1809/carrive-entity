package com.manage.carrive.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum PackageEnum {
    BOX("Box"),
    ENVELOPE("Envelope"),
    BAG("Bag");
    private final String name;
}
