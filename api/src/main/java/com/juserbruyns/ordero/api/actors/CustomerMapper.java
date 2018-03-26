package com.juserbruyns.ordero.api.actors;

import com.juserbruyns.ordero.domain.actors.customer.Customer;

public class CustomerMapper {
    public CustomerDto toDto (Customer customer){
        return CustomerDto.customerDto()
                .withCustomerFirstName(customer.getFirstName())
                .withCustomerLastName(customer.getLastName())
                .withCustomerEmail(customer.getEmail())
                .withCustomerAddress(customer.getAddress())
                .withCustomerPhoneNumberName(customer.getPhoneNumber());
    }

    public Customer toDomain(CustomerDto customerDto) {
        return Customer.CustomerBuilder.customer()
                .withFirstName(customerDto.getFirstName())
                .withLastName(customerDto.getLastName())
                .withEmail(customerDto.getEmail())
                .withAddress(customerDto.getAddress())
                .withPhoneNumber(customerDto.getPhoneNumber())
                .build();
    }


}
