package com.manage.carrive.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class MessageResponse {
    private String message;
    private Integer code;
    private Object data;
}