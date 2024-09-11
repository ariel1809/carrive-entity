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
@Document(collection = "mailer")
@EqualsAndHashCode
public class Mailer {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private String subject;
    @EqualsAndHashCode.Exclude
    private String content;
    @EqualsAndHashCode.Exclude
    private String sender;
    @EqualsAndHashCode.Exclude
    private String receiver;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_at")
    private LocalDateTime sendAt;
    @EqualsAndHashCode.Exclude
    @Field(value = "is_go")
    private Boolean isGo;
}
