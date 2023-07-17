package com.rikkei.academy.model;

public class Bus extends Person {
    private int currentSize;
    private Person[] customers;
    private String busNo;


    public Bus(int size) {
        customers = new Person[size];
        currentSize = 0;

    }

    public void report() {
        int count = 0;
        int studentCount = 0;
        int employeeCount = 0;
        for (Person customer : customers) {
            if (customer != null) {
                if (customer instanceof Student) {
                    studentCount++;
                    System.out.println("Số khách Student: " + studentCount + " " + customer.toString());
                } else if (customer instanceof Employee) {
                    employeeCount++;
                    System.out.println("Số khách Employee: " + employeeCount + " " + customer.toString());
                }
            }
        }
    }

    public void push(Person p) {
        if (currentSize < customers.length) {
            customers[currentSize] = p;
            currentSize++;
        } else {
            System.out.println("Xe đã đầy");
        }

    }


    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public Person[] getCustomers() {
        return customers;
    }

    public void setCustomers(Person[] customers) {
        this.customers = customers;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }
}
