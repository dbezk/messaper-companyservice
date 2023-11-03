package com.messaper.companyservice.application.service.authentication;

import com.messaper.companyservice.application.mapper.SuperUserMapper;
import com.messaper.companyservice.domain.entity.SuperUser;
import com.messaper.companyservice.domain.repository.query.user.SuperUserQueryRepository;
import com.messaper.companyservice.infrastructure.jwt.JwtService;
import com.messaper.companyservice.presentation.request.user.AuthenticationRequest;
import com.messaper.companyservice.presentation.response.SuperUserDataResponse;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryAuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final SuperUserQueryRepository superUserQueryRepository;
    private final JwtService jwtService;

    public SuperUserDataResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getLogin(), request.getPassword())
        );
        SuperUser superUser = superUserQueryRepository.findByLogin(request.getLogin())
                .orElseThrow(() -> new EntityNotFoundException("Super user not found!"));
        SuperUserDataResponse response = SuperUserMapper.toSuperUserDataResponse(superUser);
        response.setToken(jwtService.generateToken(superUser));
        return response;
    }

}
