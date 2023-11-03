package com.messaper.companyservice.application.service.initialization.query;

import com.messaper.companyservice.domain.repository.query.company.CompanyQueryRepository;
import com.messaper.companyservice.domain.repository.query.user.SuperUserQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InitializationQueryService {

    private final CompanyQueryRepository companyQueryRepository;
    private final SuperUserQueryRepository superUserQueryRepository;

    public boolean isCompanyInitialized() {
        return companyQueryRepository.existsByIdIs(1L);
    }

    public boolean isSuperUserInitialized() {
        return superUserQueryRepository.existsByIdIs(1L);
    }

}
