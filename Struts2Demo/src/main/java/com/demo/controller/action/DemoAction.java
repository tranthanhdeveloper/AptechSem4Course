package com.demo.controller.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.demo.entities.Product;
import com.demo.models.ProductModel;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Namespace(value = "/demo")
public class DemoAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private int age;
	private String username;
	private Product product;
	private List<Product> products = new ArrayList<Product>();
	private int id1;
	private String id2;
	
	
	@Action(value = "index", results = {@Result(name=SUCCESS, location="/demo/index.jsp")})
	public String index() {
		ProductModel productModel = new ProductModel();
		this.age = 21;
		this.username = "tranthanh";
		this.product = productModel.find();
		this.products = productModel.findAll();
		return SUCCESS;
	}
	
	@Action(value = "hello", results = {@Result(name=SUCCESS, location="/demo/hello.jsp")})
	public String hello() {
		return SUCCESS;
	}
	
	@Action(value = "querystring", results = {@Result(name=SUCCESS, location="/demo/hello.jsp")})
	public String useQueryString() {
		System.out.println("id1 value:" + id1);
		System.out.println("id2 value:" + id2);
		return SUCCESS;
	}
	
	@Action(value = "usesession", results = {@Result(name=SUCCESS, location="/demo/hello.jsp")})
	public String useSession() {
		Map<String, Object> session  = ActionContext.getContext().getSession();
		session.put("a", 123);
		session.put("b", "abc");
		return SUCCESS;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public int getId1() {
		return id1;
	}

	public void setId1(int id1) {
		this.id1 = id1;
	}

	public String getId2() {
		return id2;
	}

	public void setId2(String id2) {
		this.id2 = id2;
	}
	
	
}
