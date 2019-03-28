package com.example.aopdemo.dao.Entity;

import java.io.Serializable;

public class Order implements Serializable {
    private String name;
    private int id;
    private static int objectsQuantity = 0;

    public Order(String name){
        this.name = name;
        id = objectsQuantity;
        ++objectsQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id == order.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
