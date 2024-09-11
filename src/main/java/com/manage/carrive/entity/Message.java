package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDate;
import java.time.LocalTime;

@ToString
@Getter @Setter
@Document(collection = "messages")
@EqualsAndHashCode
public class Message {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    private String content;
    @EqualsAndHashCode.Exclude
    private UserCarrive sender;
    @EqualsAndHashCode.Exclude
    private UserCarrive receiver;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_time")
    private LocalTime sendTime;
    @EqualsAndHashCode.Exclude
    @Field(value = "send_date")
    private LocalDate sendDate;
    @EqualsAndHashCode.Exclude
    @DBRef
    private Conversation conversation;
}
