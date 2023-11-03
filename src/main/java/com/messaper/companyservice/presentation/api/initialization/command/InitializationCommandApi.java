package com.messaper.companyservice.presentation.api.initialization.command;

import com.messaper.companyservice.application.service.initialization.command.InitializationCommandService;
import com.messaper.companyservice.presentation.request.initialization.CompanyInitializationRequest;
import com.messaper.companyservice.presentation.request.initialization.SuperUserInitializationRequest;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(value = "/api/v1/initialization")
@RequiredArgsConstructor
public class InitializationCommandApi {

    private final InitializationCommandService initializationCommandService;

    @PostMapping(value = "/initializeCompany",
                 consumes = MediaType.APPLICATION_JSON_VALUE,
                 produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> initializeCompany(HttpServletRequest request,
                                               @RequestBody CompanyInitializationRequest initializationRequest) {
        initializationCommandService.initializeCompany(initializationRequest);
        return ResponseEntity.created(URI.create(request.getRequestURI())).build();
    }

    @PostMapping(value = "/initializeSuperUser",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> initializeSuperUser(HttpServletRequest request,
                                                 @RequestBody SuperUserInitializationRequest initializationRequest) {
        initializationCommandService.initializeSuperUser(initializationRequest);
        return ResponseEntity.created(URI.create(request.getRequestURI())).build();
    }

}
