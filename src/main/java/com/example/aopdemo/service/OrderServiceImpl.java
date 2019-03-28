package com.example.aopdemo.service;
import com.example.aopdemo.dao.Entity.Order;
import com.example.aopdemo.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDAO;

    @Override
    public Order getOrder(int id) {
        return orderDAO.getOrder(id).orElseGet(()->new Order("none"));
    }
}
