package com.messaper.companyservice.domain.repository.query.user;

import com.messaper.companyservice.domain.entity.SuperUser;

import java.util.Optional;

public interface SuperUserQueryRepository {
    Optional<SuperUser> findByLogin(String login);

    boolean existsByIdIs(Long id);

}
