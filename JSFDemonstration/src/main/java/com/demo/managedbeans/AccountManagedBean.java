package com.demo.managedbeans;

import com.demo.entities.Account;
import com.demo.entities.Language;
import com.demo.entities.Role;
import com.demo.models.LanguageModel;
import com.demo.models.RoleModel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class AccountManagedBean {
    private Account account;
    private List<Language> languageList;
    private List<Role> roleList;

    public AccountManagedBean(){
        this.account = new Account();
        this.languageList = new LanguageModel().findAll();
        this.roleList = new RoleModel().findAll();
        this.account.setStatus(true);
        this.account.setId(10);
    }

    public String save(){
        System.out.println(account);
        return "success?face-redirect=true";
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Language> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(List<Language> languageList) {
        this.languageList = languageList;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
