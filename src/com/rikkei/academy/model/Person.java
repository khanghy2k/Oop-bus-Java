package com.rikkei.academy.model;

import java.util.Scanner;

public class Person {
    protected String fullName;
    protected String gender;
    protected String address;

    public Person(String fullName, String gender, String address) {
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;

    }

    public Person() {

    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên :  ");
        this.fullName = scanner.nextLine();
        System.out.println("Giới tính (1 : Nam , 2 : Nữ) ");
        int genderChoice = scanner.nextInt();
        scanner.nextLine();
        this.gender = (genderChoice == 1) ? "Nam" : "Nữ";
        System.out.println("Nhập địa chỉ : ");
        this.address = scanner.nextLine();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override

    public String toString(){
            return "Person [fullName = " + fullName + ",gender = " + gender + ",address = " + address;
    }


}
