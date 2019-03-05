package com.demo.managedbeans;

import com.demo.entities.Employee;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployeeManagedBean {
    private Employee employee;

    public EmployeeManagedBean(){
        this.employee = new Employee();
    }

    public String save(){
        return "success?face-redirect=true";
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
