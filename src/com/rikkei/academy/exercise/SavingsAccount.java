package com.rikkei.academy.exercise;

import jdk.jfr.Percentage;

public class SavingsAccount extends BankAccount{
    private Percentage annualInteresRate;

    @Override
    public double withdrawal(double amount) {
        return super.withdrawal(amount);
    }

    public Percentage getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(Percentage annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public void deposItMonthlyInterest(){

    }
}
