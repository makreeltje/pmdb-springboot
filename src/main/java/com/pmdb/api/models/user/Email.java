package com.pmdb.api.models.user;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "emails", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    @javax.validation.constraints.Email
    private String email;

    public Email(Long id, @NotBlank @Size(max = 50) @javax.validation.constraints.Email String email) {
        this.id = id;
        this.email = email;
    }

    public Email() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
