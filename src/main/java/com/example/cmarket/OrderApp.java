package com.example.cmarket;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserGrade;

public class OrderApp {

    public static void main(String[] args) {

        CurrentDiscountInfo discountInfo = new CurrentDiscountInfo();

        User user = new User(0L,"kimcoding",UserGrade.GRADE_1);
        int discountPrice = discountInfo.discount(user,5000);

        if(discountPrice == 500){
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("1등급 회원으로 5000 -> " + discountPrice);
        }

        user = new User(0L,"leejava",UserGrade.GRADE_2);
        discountPrice = discountInfo.discount(user,5000);

        if(discountPrice == 1000){
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("2등급 회원으로 5000 -> "+discountPrice);
        }
    }
}
