package com.sadadream.domain;

import java.util.List;

public interface RoleRepository {
    List<Role> findAllByUserId(Long userId);

    Role save(Role role);
}
