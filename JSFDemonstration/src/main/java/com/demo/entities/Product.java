package com.demo.entities;

import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private String photo;

    public Product(String id, String name, double price, int quantity, String photo) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.photo = photo;
    }

    public Product() {
    }

    public String getId() {
        return id;
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

    public double getPrice() {
        return price;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                quantity == product.quantity &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(photo, product.photo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity, photo);
    }
}
