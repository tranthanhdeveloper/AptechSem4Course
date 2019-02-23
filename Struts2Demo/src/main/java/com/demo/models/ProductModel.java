package com.demo.models;

import java.util.ArrayList;
import java.util.List;

import com.demo.entities.Product;

public class ProductModel {
	public Product find() {
		return new Product("p01", "product 01", 10, "thumb1.gif");
	}
	
	public List<Product> findAll() {
		List<Product> results = new ArrayList<Product>();
		results.add(new Product("p01", "product 01", 10, "thumb1.gif"));
		results.add(new Product("p02", "product 02", 10, "thumb2.gif"));
		results.add(new Product("p03", "product 03", 10, "thumb3.gif"));
		return results;
	}

}
