package com.juserbruyns.ordero.domain.actors.customer;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerRepositoryTest {

    @Test
    public void storeCustomer() {
        //Given
        CustomerRepository customerRepository = new CustomerRepository();

        //WHEN
        Customer expectedCustomer = Customer.CustomerBuilder.customer().withFirstName("Julius").build();
        Customer expectedCustomer2 = Customer.CustomerBuilder.customer().withLastName("Brutus").build();

        Customer actualCustomer = customerRepository.storeCustomer(expectedCustomer);
        Customer actualCustomer2 = customerRepository.storeCustomer(expectedCustomer2);

        //THEN
        Assertions.assertThat(actualCustomer).isEqualTo(expectedCustomer);
        Assertions.assertThat(actualCustomer2).isEqualTo(expectedCustomer2);
    }

    @Test
    public void updateCustomer() {
        //GIVEN
        CustomerRepository customerRepository = new CustomerRepository();
        Customer customerToUpdate =  Customer.CustomerBuilder.customer().withFirstName("Julias").build();
        Customer updatedCustomer =  Customer.CustomerBuilder.customer().withFirstName("Julius").build();
        customerRepository.storeCustomer(customerToUpdate);

        //WHEN
        customerRepository.updateCustomer(1,updatedCustomer);

        //THEN
        Assertions.assertThat(customerRepository.getCustomer(1).getFirstName()).isEqualTo(updatedCustomer.getFirstName());
    }
}