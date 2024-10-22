package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
@Document(collection = "car_documents")
@EqualsAndHashCode
public class CarDocument {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_registration")
    private String carRegistration;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_registration_name")
    private String carRegistrationName;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_registration_download")
    private String carRegistrationDownload;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_registration_valid")
    private Boolean carRegistrationValid = false;
    @EqualsAndHashCode.Exclude
    private String insurance;
    @EqualsAndHashCode.Exclude
    @Field(value = "insurance_name")
    private String insuranceName;
    @EqualsAndHashCode.Exclude
    @Field(value = "insurance_download")
    private String insuranceDownload;
    @EqualsAndHashCode.Exclude
    @Field(value = "insurance_valid")
    private Boolean insuranceValid = false;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_inspection")
    private String carInspection;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_inspection_name")
    private String carInspectionName;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_inspection_download")
    private String carInspectionDownload;
    @EqualsAndHashCode.Exclude
    @Field(value = "car_inspection_valid")
    private Boolean carInspectionValid = false;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_valid")
    private Boolean isValid = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_at")
    private LocalDateTime sendAt;
    @EqualsAndHashCode.Exclude
    @Field(value = "valid_at")
    private LocalDateTime validAt;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Car car;
}
