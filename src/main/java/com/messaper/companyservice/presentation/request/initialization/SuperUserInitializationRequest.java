package com.messaper.companyservice.presentation.request.initialization;

import lombok.Data;

@Data
public class SuperUserInitializationRequest {

    private String lastName;
    private String firstName;
    private String middleName;

    private String email;
    private String phoneNumber;

    private String login;
    private String password;

}
