package com.tranthanh.sem4.demosession1.controllers;

import com.tranthanh.sem4.demosession1.entities.Employee;
import com.tranthanh.sem4.demosession1.validators.EmployeeValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller()
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping("register")
    public String register(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/register";
    }

    @PostMapping("register")
    public String register(@ModelAttribute("employee") @Valid Employee employee, BindingResult employeeBindResult) {
        EmployeeValidator employeeValidator = new EmployeeValidator();
        employeeValidator.validate(employee, employeeBindResult);
        if (employeeBindResult.hasErrors()){
            return "employee/register";
        }else {
            System.out.println(employee.toString());
            return "employee/success";
        }
    }
}