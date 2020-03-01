package com.pmdb.api.auth.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
