package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString(callSuper = true)
@Getter @Setter
public class DriverDto extends UserCarriveDto{
    private List<CarDto> cars = new ArrayList<>();
    private PersonalDocumentDto personalDocumentDto;
    private List<ItineraryDto> itineraries = new ArrayList<>();
}
