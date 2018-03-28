package com.juserbruyns.ordero.services;

import com.juserbruyns.ordero.domain.actors.customer.Customer;
import com.juserbruyns.ordero.domain.actors.customer.CustomerRepository;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
public class CustomerService {
    private final CustomerRepository customerRepository;

    @Inject
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.storeCustomer(customer);
    }

    public List<Customer> getCustomers(){
        return customerRepository.getCustomers();
    }

    public Customer getCustomer(int id){
        return customerRepository.getCustomer(id);
    }


}
