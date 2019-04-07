package com.tranthanh.sem4.demosession1.controllers;

import com.tranthanh.sem4.demosession1.entities.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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

    @GetMapping(value = "/demo7")
    public String demo7(){
        return "demo/demo7";
    }

    @PostMapping(value = "/search")
    public String search(HttpServletRequest request){
        String keyword = request.getParameter("keyword");
        System.out.println("Keyword: "+keyword);
        return "demo/demo7";
    }

    @PostMapping(value = "/update")
    public String update(HttpServletRequest request){
        String[] quantites = request.getParameterValues("quantity");
        for (String quantity : quantites ) {
            System.out.println(quantity);
        }
        return "demo/demo7";
    }

    // Working with session
    @GetMapping(value = "/demo8")
    public String demo8(HttpSession httpSession){
        httpSession.setAttribute("username", "abc");
        httpSession.setAttribute("age", 20);

        return "demo/demo8";
    }

    // Redirect to other URL
    @GetMapping(value = "/demo9")
    public String demo9(){
        return "redirect:/demo/demo8";
    }
}