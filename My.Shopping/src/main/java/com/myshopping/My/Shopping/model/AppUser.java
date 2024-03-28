package com.myshopping.My.Shopping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity//this annotation will tell hibernate that u need to create a table
public class AppUser {
    @Id//create primary key of UUID id
    UUID id;
    String name;
    @Column(unique = true,nullable = false)//email
    String email;

    @Column(nullable = false)//for password
    String password;
    String userType;

    @Column(unique = true,length = 10)//phoneNumber
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
