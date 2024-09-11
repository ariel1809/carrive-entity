package com.manage.carrive.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter @Setter
public class ConversationDto {
    private UserCarriveDto user1;
    private UserCarriveDto user2;
    private List<MessageDto> messages = new ArrayList<>();
    private LocalDateTime createdAt;
}
