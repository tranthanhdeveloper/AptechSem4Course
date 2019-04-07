package com.tranthanh.sem4.demosession1.validators;

import com.tranthanh.sem4.demosession1.entities.Employee;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class EmployeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee)target;
        if (employee.getUsername().equalsIgnoreCase("abc")){
            errors.rejectValue("username", "account.username.exists");
        }
    }
}
