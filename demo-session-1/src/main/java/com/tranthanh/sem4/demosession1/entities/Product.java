package com.tranthanh.sem4.demosession1.entities;

public class Product {
    private String id;
    private String name;
    private String photo;
    private double price;
    private int quantity;

    public String getId() {
        return id;
    }
    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String id, String name, String photo, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
        this.quantity = quantity;
    }
}
