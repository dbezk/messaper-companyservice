package com.messaper.companyservice.repository;

import com.messaper.companyservice.infrastructure.repository.company.CompanyRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CompanyRepositoryTests {

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    public void CompanyRepository_Exists_ReturnFalse() {
        Assertions.assertThat(companyRepository.existsById(1L)).isFalse();
    }



}
