package com.codecool.SimpleRESTAPI.CustomerREST.repository;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Address;
import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import org.junit.jupiter.api.Assertions;

class CustomerRepositoryImplTest {

    CustomerRepositoryImpl repository;

    @org.junit.jupiter.api.BeforeEach
    void beforeAll() {
        repository = new CustomerRepositoryImpl();
    }

    @org.junit.jupiter.api.Test
    void findById_ShouldReturnCustomer_WhenCustomerExistsInRepository() {
        Customer customer = new Customer(1, "David", new Address("Krakow", "Slusarska", "30-714"));
        repository.save(customer);
        Assertions.assertEquals(customer, repository.findById(1));
    }

    @org.junit.jupiter.api.Test
    void findById_ShouldReturnNull_WhenRepositoryIsEmpty() {
        Assertions.assertEquals(null, repository.findById(3));
    }

    @org.junit.jupiter.api.Test
    void findById_ShouldReturnNull_WhenCustomerIdDoesntExistInRepository() {
        Customer customer = new Customer(1, "David", new Address("Krakow", "Slusarska", "30-714"));
        repository.save(customer);
        Assertions.assertEquals(null, repository.findById(2));
    }

    @org.junit.jupiter.api.Test
    void save_ShouldAddFirstCustomerToRepositoryKey1_WhenRepositoryIsEmpty() {
        Customer customer = new Customer(2, "David", new Address("Krakow", "Slusarska", "30-714"));
        Customer expected = new Customer(1, "David", new Address("Krakow", "Slusarska", "30-714"));
        repository.save(customer);
        Assertions.assertEquals(expected, repository.findById(1));
    }

    @org.junit.jupiter.api.Test
    void save_ShouldAddCustomerToRepositoryKey2_WhenLastCustomerIdIs1() {
        Customer customer = new Customer(1, "David", new Address("Krakow", "Slusarska", "30-714"));
        Customer customer2 = new Customer(1, "Mark", new Address("Krakow", "Slusarska", "30-714"));
        Customer expected = new Customer(2, "Mark", new Address("Krakow", "Slusarska", "30-714"));
        repository.save(customer);
        repository.save(customer2);
        Assertions.assertEquals(expected, repository.findById(2));
    }
}