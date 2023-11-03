package com.messaper.companyservice.presentation.api.initialization.query;

import com.messaper.companyservice.application.service.initialization.query.InitializationQueryService;
import com.messaper.companyservice.presentation.response.initialization.InitializeStatusResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/initialization")
@RequiredArgsConstructor
public class InitializationQueryApi {

    private final InitializationQueryService initializationQueryService;

    @GetMapping(value = "/companyStatus", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InitializeStatusResponse> checkCompanyInitialization() {
        boolean isInitialized = initializationQueryService.isCompanyInitialized();
        return ResponseEntity.ok(new InitializeStatusResponse(isInitialized));
    }

    @GetMapping(value = "/superUserStatus", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<InitializeStatusResponse> checkSuperUserInitialization() {
        boolean isInitialized = initializationQueryService.isSuperUserInitialized();
        return ResponseEntity.ok(new InitializeStatusResponse(isInitialized));
    }

}
