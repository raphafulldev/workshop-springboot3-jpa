package com.raphafulldev.course.services;

import com.raphafulldev.course.entities.Product;
import com.raphafulldev.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }

    public Product findById (Long id){
        return repository.findById(id).get();
    }


}
