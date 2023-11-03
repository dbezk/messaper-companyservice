package com.messaper.companyservice.infrastructure.repository.user;

import com.messaper.companyservice.domain.entity.SuperUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SuperUserRepository extends JpaRepository<SuperUser, Long> {

    Optional<SuperUser> findByLogin(String login);

    boolean existsByIdIs(Long id);

}
