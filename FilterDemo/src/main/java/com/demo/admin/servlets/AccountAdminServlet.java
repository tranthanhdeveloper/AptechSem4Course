package com.demo.admin.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/admin/account")
public class AccountAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AccountAdminServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action == null) {
			doGet_login(request, response);
		}else if (action.equalsIgnoreCase("logout")) {
			doGet_logout(request, response);
		}
	}

	private void doGet_login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/admin/account/login.jsp").forward(request, response);
		
	}
	
	private void doGet_logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("username");
		request.getRequestDispatcher("/admin/account/login.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equalsIgnoreCase("login")) {
			doPost_login(request, response);
		}
	}
	
	private void doPost_login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		
		if (username.equals("admin") && password.equals("123")) {
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", username);
			request.getRequestDispatcher("/admin/account/welcome.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/admin/account/error.jsp").forward(request, response);
		}
	}

}
