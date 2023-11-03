package com.messaper.companyservice.application.mapper;

import com.messaper.companyservice.domain.entity.SuperUser;
import com.messaper.companyservice.presentation.request.initialization.SuperUserInitializationRequest;
import com.messaper.companyservice.presentation.response.SuperUserDataResponse;

public class SuperUserMapper {

    public static SuperUserDataResponse toSuperUserDataResponse(SuperUser superUser) {
        return SuperUserDataResponse.builder()
                .firstName(superUser.getFirstName())
                .lastName(superUser.getLastName())
                .middleName(superUser.getMiddleName())
                .email(superUser.getEmail())
                .phoneNumber(superUser.getPhoneNumber()).build();
    }

    public static SuperUser toSuperUser(SuperUserInitializationRequest superUserInitializationRequest) {
        return SuperUser.builder()
                .firstName(superUserInitializationRequest.getFirstName())
                .lastName(superUserInitializationRequest.getLastName())
                .middleName(superUserInitializationRequest.getMiddleName())
                .email(superUserInitializationRequest.getEmail())
                .phoneNumber(superUserInitializationRequest.getPhoneNumber())
                .login(superUserInitializationRequest.getLogin())
                .password(superUserInitializationRequest.getPassword()).build();
    }

}
