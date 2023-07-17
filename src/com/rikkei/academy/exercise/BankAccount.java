package com.rikkei.academy.exercise;

public class BankAccount {
    private String owner;
    private double balance;


    public BankAccount(){

    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public double deposit (double amount){
        return amount;
    }
    public double withdrawal(double amount){
        return amount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
