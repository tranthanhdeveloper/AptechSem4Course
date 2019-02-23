package com.demo.controller.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

@Namespace(value = "/news")
public class NewsAction extends ActionSupport {

    @Action(value = "index", results = {
            @Result(name = SUCCESS, location = "news.index", type = "tiles")
    })
    public String index(){
        return SUCCESS;
    }
}
