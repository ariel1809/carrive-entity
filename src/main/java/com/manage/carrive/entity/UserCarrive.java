package com.manage.carrive.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.manage.carrive.enumeration.UserTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter @Setter
@Document(collection = "user_carrive")
@EqualsAndHashCode
public abstract class UserCarrive {
    @EqualsAndHashCode.Exclude
    private String name;
    @EqualsAndHashCode.Exclude
    private String email;
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private String password;
    @EqualsAndHashCode.Exclude
    private String token;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_register")
    private Boolean isRegister = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_active")
    private Boolean isActive = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_connected")
    private Boolean isConnected = Boolean.FALSE;
    @EqualsAndHashCode.Exclude
    @Field(value = "register_at")
    private LocalDateTime registerAt;
    @EqualsAndHashCode.Exclude
    @Field(value = "user_type")
    private UserTypeEnum userType;
    @EqualsAndHashCode.Exclude
    @DBRef
    private List<Conversation> conversations = new ArrayList<>();
}
