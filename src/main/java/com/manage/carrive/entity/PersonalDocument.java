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
@Document(collection = "personal_document")
@EqualsAndHashCode
public class PersonalDocument {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "proof_identity")
    private String proofIdentity;
    @EqualsAndHashCode.Exclude
    @Field(value = "proof_identity_name")
    private String proofIdentityName;
    @EqualsAndHashCode.Exclude
    @Field(value = "proof_identity_download")
    private String proofIdentityDownload;
    @EqualsAndHashCode.Exclude
    @Field(value = "proof_identity_valid")
    private Boolean proofIdentityIsValid = false;
    @EqualsAndHashCode.Exclude
    @Field(value = "driver_license")
    private String driverLicense;
    @EqualsAndHashCode.Exclude
    @Field(value = "driver_license_name")
    private String driverLicenseName;
    @EqualsAndHashCode.Exclude
    @Field(value = "driver_license_download")
    private String driverLicenseDownload;
    @EqualsAndHashCode.Exclude
    @Field(value = "driver_license_valid")
    private Boolean driverLicenseValid = false;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_date")
    private LocalDateTime sendDate;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Driver driver;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_valid")
    private Boolean isValid = Boolean.FALSE;
}
