package com.juserbruyns.ordero.domain.actors.customer;

import javax.inject.Named;
import java.util.*;
import java.util.stream.Collectors;

@Named
public class CustomerRepository {
    private Map<Integer, Customer> customers;
    private static int customerIndex = 0;

    public CustomerRepository() {
        this.customers = new HashMap<>();
    }

    public Customer storeCustomer(Customer customer) {
        customer.setId(++customerIndex);
        customers.put(customer.getId(), customer);
        return customers.get(customerIndex);
    }

    public Customer updateCustomer(int customerId, Customer updatedCustomer) {
        customers.put(customerId, updatedCustomer);
        return updatedCustomer;
    }

    public List<Customer> getCustomers() {
        return Collections.unmodifiableList(new ArrayList<>(customers.values()));
    }

    public Customer getCustomer(int id) {
        return customers.get(id);
    }
}
