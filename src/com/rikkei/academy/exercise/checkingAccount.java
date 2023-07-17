package com.rikkei.academy.exercise;

public class checkingAccount  extends BankAccount{
    private double insuffcienFundsFee;

    public checkingAccount(double insuffcienFundsFee) {
        this.insuffcienFundsFee = insuffcienFundsFee;
    }
    public checkingAccount(){

    }
    public void processCheck(boolean checkToProcess){
    }

    @Override
    public double withdrawal(double amount) {
        return super.withdrawal(amount);
    }

    public double getInsuffcienFundsFee() {
        return insuffcienFundsFee;
    }

    public void setInsuffcienFundsFee(double insuffcienFundsFee) {
        this.insuffcienFundsFee = insuffcienFundsFee;
    }
}

