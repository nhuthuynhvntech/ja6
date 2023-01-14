package com.example.ja6.controller;

import com.example.ja6.entity.Order;
import com.example.ja6.service.impl.OrderService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/rest/orders")
public class restOrder {
    @Autowired
    OrderService orderService;
@PostMapping()
    public Order create(@RequestBody JsonNode orderData){
        return orderService.create(orderData);
    }

}
