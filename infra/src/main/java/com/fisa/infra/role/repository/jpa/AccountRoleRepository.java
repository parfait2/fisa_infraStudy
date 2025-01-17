package com.fisa.infra.role.repository.jpa;

import com.fisa.infra.role.domain.entity.AccountRole;
import com.fisa.infra.role.repository.basic.CommonAccountRoleRepository;
import org.springframework.data.repository.Repository;

public interface AccountRoleRepository extends Repository<AccountRole, AccountRole.Pk>, CommonAccountRoleRepository {
}
