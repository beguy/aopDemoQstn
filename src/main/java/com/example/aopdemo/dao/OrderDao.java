package com.example.aopdemo.dao;
import com.example.aopdemo.dao.Entity.Order;
import java.util.Optional;

public interface OrderDao {
    Optional<Order> getOrder(int id);
}
