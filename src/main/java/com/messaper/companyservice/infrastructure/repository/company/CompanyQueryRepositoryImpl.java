package com.messaper.companyservice.infrastructure.repository.company;

import com.messaper.companyservice.domain.repository.query.company.CompanyQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "companyQueryRepository")
@RequiredArgsConstructor
public class CompanyQueryRepositoryImpl implements CompanyQueryRepository {

    private final CompanyRepository companyRepository;

    @Override
    public boolean existsByIdIs(Long id) {
        return companyRepository.existsByIdIs(id);
    }
}
