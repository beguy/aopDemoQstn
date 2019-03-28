package com.example.aopdemo.dao;

import com.example.aopdemo.dao.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class OrderDaoMapImpl implements OrderDao {
    final Map<Integer, Order> orderMap = new HashMap<>();

    public Optional<Order> getOrder(int id) {
        return Optional.ofNullable(orderMap.get(id));
    }

    @Autowired
    public void setOrderFromList(List<Order> orders) {
        orders.forEach(order -> orderMap.put(order.getId(), order));
    }
}
