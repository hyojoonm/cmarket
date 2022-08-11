package com.example.cmarket.order;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.DiscountInfo;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserRepository;
import com.example.cmarket.user.UserRepositoryImpl;

public class OrderServiceImpl {

    private final UserRepository userRepository = new UserRepositoryImpl();
    private final DiscountInfo discountInfo = new CurrentDiscountInfo();

    public Order createOrder(Long userId, String itemName , int itemPrice){
        User user = userRepository.findByUserId(userId);
        int discountPrice = discountInfo.discount(user,itemPrice);

        return new Order(userId,itemName,itemPrice,discountPrice);
    }
}
