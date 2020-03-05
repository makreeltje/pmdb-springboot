package com.pmdb.api.repository.user;

import com.pmdb.api.models.user.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
    Boolean existsByEmail(String email);
}
