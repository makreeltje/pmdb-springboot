package com.pmdb.api.controllers;

import com.pmdb.api.models.user.Email;
import com.pmdb.api.models.user.User;
import com.pmdb.api.repository.user.EmailRepository;
import com.pmdb.api.repository.user.UserRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserRepository userRepository;
    private EmailRepository emailRepository;

    @GetMapping("/all")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("emails")
    @PreAuthorize("hasRole('ADMIN')")
    public List<Email> getAllEmails() { return emailRepository.findAll();}
}
