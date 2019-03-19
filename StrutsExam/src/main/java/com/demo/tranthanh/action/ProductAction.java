package com.demo.tranthanh.action;

import com.demo.tranthanh.entities.Product;
import com.demo.tranthanh.models.ProductModel;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.ArrayList;
import java.util.List;

@Namespace(value = "/product")
public class ProductAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	private Product product;
	private int id;
	private List<Product> products = new ArrayList<Product>();

	
	@Action(value = "index", results = {@Result(name=SUCCESS, location="/product/list.jsp")})
	public String index() {
		ProductModel productModel = new ProductModel();
		this.products = productModel.findAll();
		return SUCCESS;
	}

	@Action(value = "add", results = {@Result(name=SUCCESS, location="/product/add.jsp")})
	public String add() {
		return SUCCESS;
	}

	@Action(value = "processAdd", results = {@Result(name = INPUT, type = "redirectAction", params = {"namespace", "/product","actionName", "index"})})
	public String processAdd() {
		ProductModel productModel = new ProductModel();
		productModel.create(this.product);
		return INPUT;
	}

	@Action(value = "delete", results = {
			@Result(name = SUCCESS, type = "redirectAction", params = {
					"namespace","/product",
					"actionName","index"
			})
	})
	public String delete() {
		ProductModel productModel = new ProductModel();
		productModel.delete(productModel.findById(id));
		return SUCCESS;
	}

	@Action(value = "edit", results = {
			@Result(name = SUCCESS, location="/product/update.jsp")
	})
	public String edit() {
		ProductModel productModel = new ProductModel();
		product = productModel.findById(id);
		return SUCCESS;
	}

	@Action(value = "update", results = {
			@Result(name = SUCCESS, type = "redirectAction", params = {
					"namespace","/product",
					"actionName","index"
			})
	})
	public String update() {
		ProductModel productModel = new ProductModel();
		productModel.update(product);
		return SUCCESS;
	}

	@Action(value = "processUpdate", results = {@Result(name = INPUT, type = "redirectAction", params = {"namespace", "/product","actionName", "index"})})
	public String processUpdate() {
		ProductModel productModel = new ProductModel();
		this.products = productModel.findAll();
		return SUCCESS;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
