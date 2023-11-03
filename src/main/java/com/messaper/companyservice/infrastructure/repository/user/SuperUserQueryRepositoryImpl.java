package com.messaper.companyservice.infrastructure.repository.user;

import com.messaper.companyservice.domain.entity.SuperUser;
import com.messaper.companyservice.domain.repository.query.user.SuperUserQueryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component(value = "superUserQueryRepository")
@RequiredArgsConstructor
public class SuperUserQueryRepositoryImpl implements SuperUserQueryRepository {

    private final SuperUserRepository superUserRepository;

    @Override
    public Optional<SuperUser> findByLogin(String login) {
        return superUserRepository.findByLogin(login);
    }

    @Override
    public boolean existsByIdIs(Long id) {
        return superUserRepository.existsByIdIs(id);
    }

}
