package com.pmdb.api.repository.user;

import com.pmdb.api.models.user.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    Boolean existsByEmail(String email);
}
