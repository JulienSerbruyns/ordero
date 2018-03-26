package com.juserbruyns.ordero.api.actors;

public class CustomerDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    public static CustomerDto customerDto() {
        return new CustomerDto();
    }

    public CustomerDto withCustomerFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerDto withCustomerLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerDto withCustomerEmail(String email) {
        this.email = email;
        return this;
    }

    public CustomerDto withCustomerAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerDto withCustomerPhoneNumberName(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}