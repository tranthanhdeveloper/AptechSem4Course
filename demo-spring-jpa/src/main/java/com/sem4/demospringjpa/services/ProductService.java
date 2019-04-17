package com.sem4.demospringjpa.services;

import com.sem4.demospringjpa.entities.Product;

import java.util.List;

public interface ProductService {

    Iterable<Product> findAll();

    Product find(int id);

    Product save(Product product);

    Product update(Product product);

    List<Product> search(double min, double max);

    List<Product> searchNameStartWith(String keyword);

    List<Product> searchNameEndWith(String keyword);

    List<Product> searchNameContain(String keyword);

    List<Product> searchTopProduct(int number);
}
