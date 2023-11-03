package com.messaper.companyservice.domain.repository.command.company;


import com.messaper.companyservice.domain.entity.Company;

public interface CompanyCommandRepository {

    void save(Company company);

}
