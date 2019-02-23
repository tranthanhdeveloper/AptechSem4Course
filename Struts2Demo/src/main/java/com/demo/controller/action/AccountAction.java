package com.demo.controller.action;

import com.demo.entities.Account;
import com.demo.entities.Language;
import com.demo.entities.Role;
import com.demo.models.LanguageModel;
import com.demo.models.RoleModel;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import java.util.List;

@Namespace(value = "/account")
public class AccountAction extends ActionSupport {

    private Account account;
    private List<Language> languageList;
    private List<Role> roleList;

    @Action(value = "index", results = {@Result(name = SUCCESS, location = "/WEB-INF/account/index.jsp")})
    public String index(){
        this.account = new Account();
        this.account.setDescription("Test add default description");
        this.account.setStatus(true);
        this.account.setLanguages(new String[]{"lang1", "lang3"});
        this.account.setGender("m");

        this.languageList = new LanguageModel().findAll();
        this.roleList = new RoleModel().findAll();
        return SUCCESS;
    }

    @Action(value = "save", results = {@Result(name = SUCCESS, location = "/WEB-INF/account/success.jsp")})
    public String save(){
        System.out.println("Account info" );
        System.out.println("username:" + account.getUsername());
        System.out.println("password:" + account.getPassword());
        System.out.println("Description:" + account.getDescription());
        System.out.println("Account status:" + account.isStatus());
        for (String actLanguage : account.getLanguages()) {
            System.out.println(actLanguage);
        }
        System.out.println("gender"+account.getGender());
        System.out.println("Role: "+account.getRole());
        return SUCCESS;
    }

    @Action(value = "login",
            results = {@Result(name = SUCCESS, location = "/WEB-INF/account/login.jsp"), @Result(name = ERROR, location = "/WEB-INF/account/login.jsp")}
    )
    public String login(){
        if (account.getUsername().equals("abc")&& account.getPassword().equals("123")){
            return SUCCESS;
        }else {
            return ERROR;
        }

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
