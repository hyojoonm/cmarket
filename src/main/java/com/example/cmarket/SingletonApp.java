package com.example.cmarket;


import com.example.cmarket.singleton.SingletonService;

public class SingletonApp {

    static SingletonService singletonService1 = SingletonService.getInstance();

    static SingletonService singletonService2 = SingletonService.getInstance();


    public static void main (String[] args){
        System.out.println("singlteonService1 : " + singletonService1);
        System.out.println("singletonService2 : " + singletonService2);
    }
}
