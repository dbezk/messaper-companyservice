package com.messaper.companyservice.infrastructure.config;

import com.messaper.companyservice.infrastructure.repository.user.SuperUserRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = {SuperUserRepository.class})
public class JpaConfig {
}
