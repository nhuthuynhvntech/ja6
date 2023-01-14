package com.example.ja6.service.impl;


import com.example.ja6.dao.OrderDAO;
import com.example.ja6.dao.OrderDetailDAO;
import com.example.ja6.entity.Order;
import com.example.ja6.entity.OrderDetail;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderImpl implements OrderService{
    @Autowired
    OrderDAO orderDAO;
    @Autowired
    OrderDetailDAO orderDetailDAO;

    @Override
    public Order create(JsonNode orderData) {
        ObjectMapper mapper = new ObjectMapper();
        Order order = mapper.convertValue(orderData,Order.class);
        orderDAO.save(order);
        TypeReference<List<OrderDetail>> type= new TypeReference<List<OrderDetail>>(){};
        List<OrderDetail> details = mapper.convertValue(orderData.get("orderDetails"),type)
                .stream().peek(d->d.setOrder(order)).collect(Collectors.toList());
        orderDetailDAO.saveAll(details);
        return order;



    }

    @Override
    public Order findById(Long id) {
        return orderDAO.findById(id).get();
    }

    @Override
    public List<Order> findByUsername(String username) {
        return orderDAO.findByUserName(username);
    }
}
