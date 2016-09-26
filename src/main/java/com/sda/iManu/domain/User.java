package com.sda.iManu.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Represents customer data.
 */
@Setter
@Getter
@ToString
public class User {

    @Id
    private String id;

    @NotNull
    @Min(5)
    @Max(12)
    @Indexed(unique = true)
    private String login;

    @NotNull
    @Min(5)
    @Max(12)
    private String password;

    private boolean isAdmin;

    @NotNull
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    public User() {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }
}
