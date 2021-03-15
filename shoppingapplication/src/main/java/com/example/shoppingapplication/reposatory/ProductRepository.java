package com.example.shoppingapplication.reposatory;

import com.example.shoppingapplication.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productrepository")
public interface ProductRepository extends CrudRepository<Product,Integer> {

    List<Product> findAll();
    Product save(Product product);
    Product findById(int id);
    void deleteById(int id);
}
