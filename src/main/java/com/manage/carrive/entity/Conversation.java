package com.manage.carrive.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter @Setter
@Document(collection = "conversations")
@EqualsAndHashCode
public class Conversation {
    @EqualsAndHashCode.Include
    private String id;
    @EqualsAndHashCode.Exclude
    @DBRef
    private UserCarrive user1;
    @EqualsAndHashCode.Exclude
    @DBRef
    private UserCarrive user2;
    @EqualsAndHashCode.Exclude
    @DBRef
    private List<Message> messages = new ArrayList<>();
    @EqualsAndHashCode.Exclude
    private LocalDateTime createdAt;
}
