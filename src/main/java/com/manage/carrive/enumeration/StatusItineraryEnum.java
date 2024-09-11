package com.manage.carrive.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public enum StatusItineraryEnum {
    PENDING(400),
    FAILURE(500),
    SUCCESS(200);
    private final int status;
}
