package com.rikkei.academy.model;

import java.util.Scanner;

public class Employee extends  Person {
    private String companyName;


    public Employee(String fullName, String gender, String address, String companyName) {
        super(fullName, gender, address);
        this.companyName = companyName;
    }
    public Employee(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString(){
        return super.toString() + " , CompanyName = " + companyName + "]";
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        super.inputData();
        System.out.println("Nhập tên Công Ty :  ");
        this.companyName = scanner.nextLine();
    }
}
