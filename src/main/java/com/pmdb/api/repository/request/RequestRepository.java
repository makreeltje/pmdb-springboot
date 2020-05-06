package com.pmdb.api.repository.request;

import com.pmdb.api.models.request.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
