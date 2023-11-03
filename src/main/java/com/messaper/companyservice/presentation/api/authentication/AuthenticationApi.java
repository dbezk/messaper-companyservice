package com.messaper.companyservice.presentation.api.authentication;

import com.messaper.companyservice.application.service.authentication.QueryAuthenticationService;
import com.messaper.companyservice.presentation.request.user.AuthenticationRequest;
import com.messaper.companyservice.presentation.response.SuperUserDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/authentication")
@RequiredArgsConstructor
public class AuthenticationApi {

    private final QueryAuthenticationService queryAuthenticationService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SuperUserDataResponse> authenticate(@RequestBody AuthenticationRequest request) {
        return ResponseEntity.ok(queryAuthenticationService.authenticate(request));
    }

}
