package com.messaper.companyservice.infrastructure.repository.company;

import com.messaper.companyservice.domain.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

    boolean existsByIdIs(Long id);

}
