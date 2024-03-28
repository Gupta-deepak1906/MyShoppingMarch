package com.myshopping.My.Shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity

public class Laptop {
    @Id
    UUID id;
    String name;
    Student student;
}
