package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter @Setter
public class MailerDto {
    private String subject;
    private String content;
    private String sender;
    private String receiver;
    private LocalDateTime sendAt;
    private Boolean isGo;
}
