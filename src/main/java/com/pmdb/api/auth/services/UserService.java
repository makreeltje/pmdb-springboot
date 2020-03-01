package com.pmdb.api.auth.services;

import com.pmdb.api.auth.entities.User;


public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
