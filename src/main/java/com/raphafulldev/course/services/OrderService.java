package com.raphafulldev.course.services;

import com.raphafulldev.course.entities.Order;
import com.raphafulldev.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById (Long id){
        return repository.findById(id).get();
    }
}
