package com.demo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.entities.Account;
import com.demo.models.AccountModel;

@WebServlet(urlPatterns= {"/account"})
public class AccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AccountModel accountModel;

    public AccountServlet() {
		accountModel  = new AccountModel();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String action = request.getParameter("action");
		if (action == null) {
			request.setAttribute("contentPage", "/WEB-INF/account/list.jsp");
				request.setAttribute("accounts", accountModel.findAll(Account.class) );
			request.getRequestDispatcher("template/template.jsp").forward(request, response);
		}else if (action.equalsIgnoreCase("list")) {
			request.getRequestDispatcher("WEB-ING/account/list.jsp");
		} else{
			
		}
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
	}

}
