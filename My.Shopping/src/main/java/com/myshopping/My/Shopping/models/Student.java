package com.myshopping.My.Shopping.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.UUID;

@Entity
public class Student {
    @Id
    UUID id;
    String name;

    @OneToMany(mappedBy = "student")//to avoid duplicate
    List<Laptop> laptops;
}
