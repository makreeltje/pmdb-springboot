package com.pmdb.api.repository.user;

import com.pmdb.api.models.user.ERole;
import com.pmdb.api.models.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}