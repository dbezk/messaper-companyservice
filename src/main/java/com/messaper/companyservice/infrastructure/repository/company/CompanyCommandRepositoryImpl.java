package com.messaper.companyservice.infrastructure.repository.company;

import com.messaper.companyservice.domain.entity.Company;
import com.messaper.companyservice.domain.repository.command.company.CompanyCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "companyCommandRepository")
@RequiredArgsConstructor
public class CompanyCommandRepositoryImpl implements CompanyCommandRepository {

    private final CompanyRepository companyRepository;

    @Override
    public void save(Company company) {
        companyRepository.save(company);
    }
}
