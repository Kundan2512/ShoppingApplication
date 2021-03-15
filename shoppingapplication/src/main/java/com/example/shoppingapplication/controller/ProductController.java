package com.example.shoppingapplication.controller;

import com.example.shoppingapplication.entity.Product;
import com.example.shoppingapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService service;

    @GetMapping("/view")
    public String getApplication(Model model)
    {
        List<Product> product=new ArrayList<>();
        product=service.findAll();
        model.addAttribute("product",product);
        return "products";

    }
    @GetMapping("/add")
    public String addProducts(Model model)
    {
        Product prod=new Product();
        model.addAttribute("prod",prod);
        return "productnew";

    }
    @PostMapping("/save")
    public String saveProduct(@ModelAttribute Product prod)
    {
        service.saveProduct(prod);
        return "redirect:/product/view";
    }
    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") int id)
    {
        service.delete(id);
        return "redirect:/product/view";
    }
    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable("id") int id,Model model)
    {
        Product prod=new Product();
        prod=service.findById(id);
        model.addAttribute("product",prod);
        return "productedit";


    }




}
