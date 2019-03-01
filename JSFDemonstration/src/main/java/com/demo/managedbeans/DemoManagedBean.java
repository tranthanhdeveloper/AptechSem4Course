package com.demo.managedbeans;

import com.demo.entities.Product;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "demoManagedBean")
@SessionScoped
public class DemoManagedBean {
    private String username;
    private int age;
    private Product product;

    public DemoManagedBean() {
        this.username ="acb";
        this.age = 20;
        this.product = new Product("p01", "name 1", 4.5, 2, "thumb1.gif");
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
