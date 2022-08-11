package com.example.cmarket.order;

public class Order {
    private Long UserId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Order(Long userId,String itemName , int itemPrice,int discountPrice){
        this.UserId = userId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }
    public int discountedPrices(){
        return itemPrice - discountPrice;
    }
    public Long getUserId(){
        return UserId;
    }
    public void setUserId(Long userId){
        this.UserId = userId;
    }
    public String getItemName(){
        return itemName;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public int getItemPrice(){
        return itemPrice;
    }
    public void setItemPrice(int itemPrice){
        this.itemPrice = itemPrice;
    }
    public int getDiscountPrice(){
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice){
        this.discountPrice = discountPrice;
    }
}
