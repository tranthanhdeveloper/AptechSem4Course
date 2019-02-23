package com.demo.entities;

import com.opensymphony.xwork2.validator.annotations.*;

public class Employee {
    private String username;
    private String password;
    private String email;
    private String website;

    @RequiredStringValidator(key = "errors.required", trim = true)
    @StringLengthFieldValidator(key = "errors.rangestring", minLength = "3", maxLength = "10", trim = true)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @RequiredStringValidator(key = "errors.required", trim = true)
    @RegexFieldValidator(key = "errors.password", regexExpression = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})", trim = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @RequiredStringValidator(key = "errors.required", trim = true)
    @EmailValidator(key = "errors.email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @UrlValidator(key = "errors.url")
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


}
