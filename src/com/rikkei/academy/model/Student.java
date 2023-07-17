package com.rikkei.academy.model;

import java.util.Scanner;

public class Student extends Person {
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student(String fullName, String gender, String address, String schoolName) {
        super(fullName, gender, address);
        this.schoolName = schoolName;
    }

    public Student(){

    }

    @Override
    public String toString(){
        return super.toString() + " , schoolName = " + schoolName + "]";
    }

    @Override
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        super.inputData();
        System.out.println("Nhập tên Trường : ");
        this.schoolName = scanner.nextLine();
    }
}
