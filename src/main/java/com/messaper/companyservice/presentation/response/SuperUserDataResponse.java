package com.messaper.companyservice.presentation.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuperUserDataResponse {

    private String firstName;
    private String lastName;
    private String middleName;

    private String email;
    private String phoneNumber;

    private String token;

}
