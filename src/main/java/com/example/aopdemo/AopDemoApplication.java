package com.example.aopdemo;

import com.example.aopdemo.dao.Entity.Order;
import com.example.aopdemo.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopDemoApplication {
    @Bean
    Order shrimps(){
        return new Order("Shrimps");
    }

    @Bean
    Order potatos() {
        return new Order("Potatos");
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext springAppContext = SpringApplication.run(AopDemoApplication.class, args);
        OrderService orderService = springAppContext.getBean(OrderService.class);

        System.out.println("Order with id = " + 0 + " is " + orderService.getOrder(0).getName());
        System.out.println("Order with id = " + 1 + " is " + orderService.getOrder(1).getName());
        System.out.println("Order with id = " + 2 + " is " + orderService.getOrder(2).getName());
    }

}
