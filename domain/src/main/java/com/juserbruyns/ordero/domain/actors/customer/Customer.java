package com.juserbruyns.ordero.domain.actors.customer;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String phoneNumber;

    public Customer() {}

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static class CustomerBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String address;
        private String phoneNumber;

        private CustomerBuilder() {}

        public static CustomerBuilder customer(){return new CustomerBuilder();}

        public Customer build(){
            Customer customer = new Customer();
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setEmail(email);
            customer.setAddress(address);
            customer.setPhoneNumber(phoneNumber);
            return customer;
        }

        public CustomerBuilder withFirstName (String firstName){
            this.firstName = firstName;
            return this;
        }
        public CustomerBuilder withLastName (String lastName){
            this.lastName = lastName;
            return this;
        }
        public CustomerBuilder withEmail (String email){
            this.email = email;
            return this;
        }
        public CustomerBuilder withAddress (String address){
            this.address = address;
            return this;
        }
        public CustomerBuilder withPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
    }
}
