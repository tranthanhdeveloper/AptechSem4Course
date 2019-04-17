package com.sem4.demospringjpa.demo;

import com.sem4.demospringjpa.JPAConfiguration;
import com.sem4.demospringjpa.entities.Product;
import com.sem4.demospringjpa.services.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Demo1 {
    public static void main(String[] args) {
        try {
            AbstractApplicationContext context = new AnnotationConfigApplicationContext(JPAConfiguration.class);
            ProductService productService = context.getBean(ProductService.class);

            Product product = new Product();
            product.setName("Test Create");
            product.setPrice(12);
            product.setQuantity(15);
            product.setStatus(true);
            productService.save(product);

            context.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}