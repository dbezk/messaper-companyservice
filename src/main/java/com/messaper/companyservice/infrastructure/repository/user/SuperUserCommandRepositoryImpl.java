package com.messaper.companyservice.infrastructure.repository.user;

import com.messaper.companyservice.domain.entity.SuperUser;
import com.messaper.companyservice.domain.repository.command.user.SuperUserCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "superUserCommandRepository")
@RequiredArgsConstructor
public class SuperUserCommandRepositoryImpl implements SuperUserCommandRepository {

    private final SuperUserRepository superUserRepository;

    @Override
    public void save(SuperUser superUser) {
        superUserRepository.save(superUser);
    }

}
