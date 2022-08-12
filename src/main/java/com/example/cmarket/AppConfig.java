package com.example.cmarket;

import com.example.cmarket.order.OrderService;
import com.example.cmarket.order.OrderServiceImpl;
import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.user.UserRepository;
import com.example.cmarket.user.UserRepositoryImpl;
import com.example.cmarket.user.UserService;
import com.example.cmarket.user.UserServiceImpl;

public class AppConfig {
    public UserService userService() {
        return new UserServiceImpl( userRepository());
    }
    public UserRepository userRepository() {
        return new UserRepositoryImpl();
    }
    public OrderService OrderService(){
        return new OrderServiceImpl(userRepository(),discountInfo());
    }

    private DiscountInfo discountInfo() {
        return new CurrentDiscountInfo();
    }

}