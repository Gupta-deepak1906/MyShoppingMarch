package com.myshopping.My.Shopping.modelss;

import jakarta.persistence.*;

import java.util.UUID;

@Entity//this annotation tell the hibernate that u need to create a table

public class AppUser {
    @Id//for primary key
            @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;//unique baseId ->generated base on time
    String name;
    @Column(unique = true,nullable = false)
    String email;
    @Column(nullable = false)
    String password;
    String userType;
    @Column(unique = true,length = 10)
    Long phoneNumber;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AppUser(UUID id, String name, String email, String password, String userType, Long phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
    }
}

