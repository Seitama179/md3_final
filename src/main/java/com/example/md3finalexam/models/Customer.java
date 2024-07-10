package com.example.md3finalexam.models;

import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private LocalDate dob;
    private String phoneNumber;
    private String address;
    private String email;

    public Customer(int id, String name, LocalDate dob, String phoneNumber, String address, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
