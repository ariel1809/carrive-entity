package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
@Document(collection = "personal_document")
@EqualsAndHashCode
public class PersonalDocument {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "driver_license")
    private String driverLicense;
    @EqualsAndHashCode.Exclude
    @Field(value = "id_card")
    private String idCard;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_date")
    private LocalDateTime sendDate;
}
