package com.tranthanh.sem4.demosession1.controllers;

import com.tranthanh.sem4.demosession1.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("demo")
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        modelMap.put("age", 20);
        modelMap.put("fullname", "Tran Thanh");
        modelMap.put("price", 4.5);

        Product product = new Product("p01", "Product 1", "thumb1.gif", 12, 12);
        modelMap.put("product", product);

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("p02", "Product 2", "thumb1.gif", 12, 12));
        productList.add(new Product("p03", "Product 3", "thumb2.gif", 12, 12));
        productList.add(new Product("p04", "Product 4", "thumb3.gif", 12, 12));
        productList.add(new Product("p05", "Product 5", "thumb1.gif", 12, 12));

        modelMap.put("productList", productList);
        return "demo/index";
    }

    @RequestMapping(value = "/demo2", method = RequestMethod.GET)
    public String demo2(){

        return "demo/demo2";
    }

    @RequestMapping(value = "/demo3", method = RequestMethod.GET)
    public String demo3(){

        return "demo/demo3";
    }

    @RequestMapping(value = "/demo4/{id}", method = RequestMethod.GET)
    public String demo4(@PathVariable("id") String id){
        System.out.println(id);
        return "";
    }

    @RequestMapping(value = "/demo5/{id}/{id1}", method = RequestMethod.GET)
    public String demo5(@PathVariable("id") String id, @PathVariable("id1") String id1){
        System.out.println(id);
        System.out.println(id1);
        return "";
    }
    
    @RequestMapping(value = "/demo6", method = RequestMethod.GET)
    public String demo6(@RequestParam("page") int page){
        System.out.println("page:"+page);
        return "";
    }
}