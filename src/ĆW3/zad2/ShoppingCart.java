package ĆW3.zad2;


import java.util.ArrayList;

public class ShoppingCart {
    private int ID = (int) System.currentTimeMillis();
    double totalPrice;
    double totalDeliveryTime;
    ArrayList<Products> products = new ArrayList<>();



    public int getID() {
        return ID;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        if (products.size()>0){
            for(Products products : products){
                totalPrice += products.getPrice();
            }

        }
        return totalPrice;
    }

    public double getTotalDeliveryTime() {
        double totalDeliveryTime = 0;
        if (products.size()>0){
            for (Products products : products){
                totalDeliveryTime += products.getDeliveryTime();
            }

        }
        return totalDeliveryTime;
    }

    public ArrayList<Products> getProducts() {
        return products;
    }
    public void Sell(){
        for (Products products : products){
            products.sell();
        }
    }

}

