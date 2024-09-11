package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter @Setter
public class PassengerDto extends UserCarriveDto{
    private Double weight;
    private PackageDto pack;
    private ItineraryDto itinerary;
}
