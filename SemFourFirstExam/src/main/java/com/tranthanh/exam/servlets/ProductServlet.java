package com.tranthanh.exam.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tranthanh.exam.entities.Product;
import com.tranthanh.exam.models.ProductModel;

@WebServlet(urlPatterns= {"/product"})
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductModel productModel;
       
    public ProductServlet() {
        super();
        productModel = new ProductModel();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null) {
			doGet_List(request, response);
		}else if (action.equalsIgnoreCase("create")) {
			doGet_Create(request, response);
		}else if (action.equalsIgnoreCase("filter")) {
			doGet_Filter(request, response);
		}else {
			doGet_List(request, response);
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null) {
			doGet_List(request, response);
		}else if (action.equalsIgnoreCase("create")) {
			doPost_Create(request, response);
		}
	}
	
	protected void doGet_List(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("products", productModel.findAll());
		request.getRequestDispatcher("/product/list.jsp").forward(request, response);
	}
	
	protected void doGet_Filter(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double minPrice = 0;
		double maxPrice = 0;
		
		try {
			minPrice = Double.parseDouble(request.getParameter("minprice"));
			maxPrice = Double.parseDouble(request.getParameter("maxprice"));
		} catch (Exception e) {
			// Do nothing
		}
		request.setAttribute("products", productModel.findByPrice(minPrice, maxPrice));
		request.getRequestDispatcher("/product/list.jsp").forward(request, response);
	}
	
	protected void doGet_Create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/product/create.jsp").forward(request, response);
	}
	
	protected void doPost_Create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Product product = new Product();
		product.setName(request.getParameter("name"));
		double price =0;
		try {
			price = Double.parseDouble(request.getParameter("price"));
		} catch (Exception e) {
			price = 0;
		}
		product.setName(request.getParameter("name"));
		product.setPrice(price);
		product.setDescription(request.getParameter("description"));
		productModel.create(product);
		response.sendRedirect("product");
	}

}
