package com.myshopping.My.Shopping.modelss;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity

public class Laptop {
    @Id
    UUID id;
    String name;
    @ManyToOne
    Student student;
}

