package com.myshopping.My.Shopping.modelss;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;
@Entity

public class OrderTable {
    //Particular order can have multiple products
    //order table vs product table
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;
    int totalPrice;
    int totalQuantity;
    //Buyer is a User Type->we need to maintain relationship between user table and order table
    //from order table point of view what kind of relationship it looks like
    @ManyToOne
    AppUser user;

    @OneToMany
    //because of one to many annotation another table will get created which
    //orderId vs ProductId
    //and this table will maintain details like what are products that are present in a particular order
    List<Product> products;
    String status;//delievered,return ,cancelled,in transit
    String payments;//upi,debitCard,cod

    public OrderTable(UUID id, int totalPrice, int totalQuantity, AppUser user, List<Product> products, String status, String payments) {
        this.id = id;
        this.totalPrice = totalPrice;
        this.totalQuantity = totalQuantity;
        this.user = user;
        this.products = products;
        this.status = status;
        this.payments = payments;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public AppUser getUser() {
        return user;
    }

    public void setUser(AppUser user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayments() {
        return payments;
    }

    public void setPayments(String payments) {
        this.payments = payments;
    }
}
