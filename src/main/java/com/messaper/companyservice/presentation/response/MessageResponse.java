package com.messaper.companyservice.presentation.response;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class MessageResponse {

    private String message;
    private LocalDateTime timestamp;

}
