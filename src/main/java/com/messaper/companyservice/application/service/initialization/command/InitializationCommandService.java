package com.messaper.companyservice.application.service.initialization.command;

import com.messaper.companyservice.application.mapper.CompanyMapper;
import com.messaper.companyservice.application.mapper.SuperUserMapper;
import com.messaper.companyservice.application.service.initialization.query.InitializationQueryService;
import com.messaper.companyservice.domain.constant.Roles;
import com.messaper.companyservice.domain.entity.Company;
import com.messaper.companyservice.domain.entity.Role;
import com.messaper.companyservice.domain.entity.SuperUser;
import com.messaper.companyservice.domain.repository.command.company.CompanyCommandRepository;
import com.messaper.companyservice.domain.repository.command.user.SuperUserCommandRepository;
import com.messaper.companyservice.presentation.request.initialization.CompanyInitializationRequest;
import com.messaper.companyservice.presentation.request.initialization.SuperUserInitializationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitializationCommandService {

    private final InitializationQueryService initializationQueryService;

    private final CompanyCommandRepository companyCommandRepository;
    private final SuperUserCommandRepository superUserCommandRepository;

    public void initializeCompany(CompanyInitializationRequest initializationRequest) {
        if(initializationQueryService.isCompanyInitialized()) {
            throw new IllegalStateException("Company already initialized");
        }
        Company company = CompanyMapper.toCompany(initializationRequest);
        companyCommandRepository.save(company);
    }

    public void initializeSuperUser(SuperUserInitializationRequest registerRequest) {
        if(initializationQueryService.isSuperUserInitialized()) {
            throw new IllegalStateException("Super user already initialized");
        }
        SuperUser superUser = SuperUserMapper.toSuperUser(registerRequest);
        superUser.getRoles().add(new Role(Roles.SUPER_USER));
        superUserCommandRepository.save(superUser);
    }

}
