package com.manage.carrive.response;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MessageResponse {
    private String message;
    private Integer code;
    private Object data;
}
