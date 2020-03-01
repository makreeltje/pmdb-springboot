package com.pmdb.api.auth.repositories;

import com.pmdb.api.auth.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
