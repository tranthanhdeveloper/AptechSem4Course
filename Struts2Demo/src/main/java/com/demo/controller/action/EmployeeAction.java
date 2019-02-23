package com.demo.controller.action;

import com.demo.entities.Employee;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;

@Namespace(value = "/employee")
public class EmployeeAction extends ActionSupport {
    private Employee employee;

    @SkipValidation
    @Action(value = "index", results = {@Result(name = SUCCESS, type = "tiles", location = "employee.index")})
    public String index(){
        this.employee = new Employee();
        System.out.println(employee.getUsername());
        return SUCCESS;
    }

    @Action(value = "save", results = {@Result(name = SUCCESS, type = "tiles", location = "employee.success"), @Result(name = INPUT, type = "tiles", location = "employee.index")})
    public String save(){
        System.out.println(employee.getUsername());
        return SUCCESS;
    }

    @VisitorFieldValidator
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


    @Override
    public void validate() {
        if (this.employee.getUsername().equalsIgnoreCase("abc")){
            addFieldError("employee.username", getText("errors.existing"));
        }
    }
}
