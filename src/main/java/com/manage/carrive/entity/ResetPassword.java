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
@Document(collection = "reset_password")
@EqualsAndHashCode
public class ResetPassword {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @Field(value = "user_mail")
    private String userMail;
    @EqualsAndHashCode.Exclude
    private Integer code;
    @EqualsAndHashCode.Exclude
    @Field(value = "new_password")
    private String newPassword;
    @EqualsAndHashCode.Exclude
    @Field(value = "reset_date")
    private LocalDateTime resetDate;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_reset")
    private Boolean isReset;
    @EqualsAndHashCode.Exclude
    @DBRef
    private UserCarrive user;
}
