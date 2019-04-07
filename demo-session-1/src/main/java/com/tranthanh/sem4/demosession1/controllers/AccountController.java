package com.tranthanh.sem4.demosession1.controllers;

import com.tranthanh.sem4.demosession1.models.LanguageModel;
import com.tranthanh.sem4.demosession1.models.RoleModel;
import com.tranthanh.sem4.demosession1.services.StorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.tranthanh.sem4.demosession1.entities.Account;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("account")
public class AccountController implements ServletContextAware {

	@Value("${spring.mvc.view.prefix}")
	private String fileStoreLocation;

	private ServletContext servletContext;
	
	@RequestMapping(value="register", method = RequestMethod.GET)
	public String register(Model model) {
		System.out.println("File storage path:" + fileStoreLocation);
		Account account = new Account();
		model.addAttribute("account", account);
		model.addAttribute("languages", new LanguageModel().findAll());
		model.addAttribute("roles", new RoleModel().findAll());
		return "account/register";
	}


	@RequestMapping(value="register", method = RequestMethod.POST)
	public String register(@ModelAttribute("account") Account account, @RequestParam("fileUpload") MultipartFile fileUpload) {
		String storedPath = storeFile(fileUpload);
		System.out.println("Stored path: "+ storedPath);
		System.out.println(account.toString());
		return "account/success";
	}

	@GetMapping(value = "login")
	public String login(){
		return "account/login";
	}

	@PostMapping(value = "login")
	public String login(HttpServletRequest request, HttpSession session, ModelMap modelMap){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (username.equals("user@email.com") && password.equals("user@email.com")){
			// Set session attribute
			session.setAttribute("username", username);
			return "account/login-success";
		}else{
			modelMap.put("loginError", "Username/Password is incorrect");
			return "account/login";
		}
	}


	@GetMapping(value = "logout")
	public String logout(HttpSession session){
		session.removeAttribute("username");
		return "account/login-success";
	}


	@Override
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	private String storeFile(MultipartFile multipartFile) {
		String result = "";
		try {
			Path path = Paths.get(this.servletContext.getRealPath("/assets/images/"+multipartFile.getOriginalFilename()));

			// Store file to disk
			Files.write(path, multipartFile.getBytes());
			return multipartFile.getOriginalFilename();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}