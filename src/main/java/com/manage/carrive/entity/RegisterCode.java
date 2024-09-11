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
@Document(collection = "register_code")
@EqualsAndHashCode
public class RegisterCode {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private Integer code;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_date")
    private LocalDateTime expirationDate;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_ok")
    private Boolean isOk;
    @EqualsAndHashCode.Exclude
    @DBRef
    private UserCarrive user;
}
