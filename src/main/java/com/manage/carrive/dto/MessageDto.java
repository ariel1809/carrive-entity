package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@ToString
@Getter @Setter
public class MessageDto {
    private String content;
    private LocalTime sendTime;
    private LocalDate sendDate;
    private UserCarriveDto sender;
    private UserCarriveDto receiver;
    private ConversationDto conversation;
}
