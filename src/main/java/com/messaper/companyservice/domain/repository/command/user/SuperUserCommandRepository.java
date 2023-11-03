package com.messaper.companyservice.domain.repository.command.user;

import com.messaper.companyservice.domain.entity.SuperUser;

public interface SuperUserCommandRepository {

    void save(SuperUser superUser);

}
