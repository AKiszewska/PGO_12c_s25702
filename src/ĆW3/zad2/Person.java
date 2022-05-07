package ĆW3.zad2;

import java.util.ArrayList;
public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    private ShoppingCart currentCart;
    private ArrayList<ShoppingCart> historyCarts = new ArrayList<>();

    public Person(String name, String surname, double moneyInCash, double moneyOnCard) {
        this.setName(name);
        this.setSurname(surname);
        this.setMoneyInCash(moneyInCash);
        this.setMoneyOnCard(moneyOnCard);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null) {
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        if(surname == null) {
            throw new RuntimeException("Surname can't be empty");
        }
        this.surname = surname;
    }
    public double getMoneyInCash() {
        return moneyInCash;
    }
    public void setMoneyInCash(double moneyInCash) {
        if(moneyInCash < 0){
            throw new RuntimeException("Not enough money in cash");
        }
        this.moneyInCash = moneyInCash;
    }
    public double getMoneyOnCard() {
        return moneyOnCard;
    }
    public void setMoneyOnCard(double moneyOnCard) {
        if(moneyOnCard < 0){
            throw new RuntimeException("Not enough money on card");
        }
        this.moneyOnCard = moneyOnCard;
    }
    public void makeOrder(){
        this.currentCart = new ShoppingCart();
    }
    public void buyByCash(){
        if (this.moneyInCash < this.currentCart.totalPrice()){
            throw new RuntimeException("Not enough money in cash");
        }
        this.moneyInCash = this.moneyInCash - this.currentCart.totalPrice();
        this.currentCart.sell();
        this.historyCarts.add(this.currentCart);
        this.currentCart = null;
    }

    public void buyByCard(){
        if (this.moneyOnCard < this.currentCart.totalPrice()){
            throw new RuntimeException("Not enough money on card");
        }
        this.currentCart.sell();
        this.moneyOnCard = this.moneyOnCard - this.currentCart.totalPrice();
        this.currentCart.sell();
        this.historyCarts.add(this.currentCart);

        this.currentCart = null;
    }


    public void addToCart(Product product){
        this.currentCart.getProducts().add(product);
    }


    public void showCurrentCart(){
        if(currentCart == null){
            System.out.println("Empty Shopping Cart");
        } else {
            System.out.println("Current Shopping Cart ID:" + currentCart.getId() + "\n" +
                    "Total price: " + currentCart.totalPrice() + "\n" +
                    "Total delivery time "+ this.currentCart.totalDeliveryTime());
            for (Product product : this.currentCart.getProducts()) {
                System.out.println(product.getName() + "\n" +
                        "Price: " + product.getPrice());
            }
            System.out.println();
        }
    }
    public void showHistoryCarts(){
        for (ShoppingCart shoppingCart : this.historyCarts) {
            System.out.println("History shopping cart ID: " + shoppingCart.getId() + "\n"+
                    "Total Price: " + shoppingCart.totalPrice() + "\n");
            for (Product product : shoppingCart.getProducts()) {
                System.out.println(product.getName() + "\n"+ "Price: " + product.getPrice());
            }

            System.out.println();
        }
    }

    public void showBalance(){
        System.out.println("In Cash: " + this.moneyInCash);
        System.out.println("On Card: " + this.moneyOnCard);
        System.out.println();
    }

}
