package ĆW3.zad2;

import java.util.ArrayList;
public class Person {
    private String name;
    private String surname;
    private double moneyInCash;
    private double moneyOnCard;
    ShoppingCart current;
    ArrayList<ShoppingCart> history = new ArrayList<>();

    public Person (String name,String surname,double moneyInCash, double moneyOnCard){
        this.name = name;
        this.surname = surname;
        this.moneyInCash = moneyInCash;
        this.moneyOnCard = moneyOnCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == null) {
            throw new RuntimeException("Surname can't be empty");
        }
        this.surname = surname;
    }

    public double getMoneyInCash() {
        return moneyInCash;
    }

    public void setMoneyInCash(double moneyInCash) {
        if (moneyInCash < 0) {
            throw new RuntimeException("Not enough money in cash");
        }
        this.moneyInCash = moneyInCash;
    }

    public double getMoneyOnCard() {
        return moneyOnCard;
    }

    public void setMoneyOnCard(double moneyOnCard) {
        if (moneyOnCard < 0) {
            throw new RuntimeException("Not enough money on card");
        }
            this.moneyOnCard = moneyOnCard;
        }

        public void MakeOrder(){
        current = new ShoppingCart();

    }
    public void BuyByCard(){
        if (current.totalPrice > getMoneyOnCard()) {
            throw new RuntimeException("Not enough money on card");
        }
        else if (current.totalPrice <=getMoneyOnCard()){
            setMoneyOnCard(getMoneyOnCard()- current.totalPrice);
            this.history.add(current);
            this.current = null;
        }
    }
    public void BuyByCash(){
        if (current.totalPrice > getMoneyInCash()) {
            throw new RuntimeException("Not enough money in cash");
        }
        else if (current.totalPrice <=getMoneyInCash()){
            setMoneyInCash(getMoneyInCash()- current.totalPrice);
            this.history.add(current);
            this.current = null;

        }
    }
    }






