package com.example.shoppingapplication.service;

import com.example.shoppingapplication.entity.Product;
import com.example.shoppingapplication.reposatory.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("services")
public class ProductService {
    @Autowired
    ProductRepository productRepo;
    public List<Product> findAll()
    {
        return productRepo.findAll();
    }
    public Product saveProduct(Product pro)
    {
        return productRepo.save(pro);
    }
    public Product findById(int id)
    {
        return productRepo.findById(id);
    }
    public void delete(int id)
    {productRepo.deleteById(id);
    }










}
