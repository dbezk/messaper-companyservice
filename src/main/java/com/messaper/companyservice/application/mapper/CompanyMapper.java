package com.messaper.companyservice.application.mapper;

import com.messaper.companyservice.domain.entity.Company;
import com.messaper.companyservice.presentation.request.initialization.CompanyInitializationRequest;

public class CompanyMapper {

    public static Company toCompany(CompanyInitializationRequest companyInitializationRequest) {
        return new Company(companyInitializationRequest.getCompanyName(),
                           companyInitializationRequest.getCompanyDescription());
    }

}
