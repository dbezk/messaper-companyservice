package com.messaper.companyservice.presentation.request.user;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String login;
    private String password;

}
