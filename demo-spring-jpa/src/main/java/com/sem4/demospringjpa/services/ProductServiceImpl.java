package com.sem4.demospringjpa.services;

import com.sem4.demospringjpa.entities.Product;
import com.sem4.demospringjpa.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        System.out.println("accessed service");
        return productRepository.findAll();
    }

    @Override
    public Product find(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> search(double min, double max) {
        return productRepository.findByPrice(min, max);
    }

    @Override
    public List<Product> searchNameStartWith(String keyword) {
        return productRepository.findNameStartWith(keyword);
    }

    @Override
    public List<Product> searchNameEndWith(String keyword) {
        return productRepository.findNameEndWith(keyword);
    }

    @Override
    public List<Product> searchNameContain(String keyword) {
        return productRepository.findNameContains(keyword);
    }

    @Override
    public List<Product> searchTopProduct(int number) {
        return productRepository.findTopProduct(number);
    }
}
