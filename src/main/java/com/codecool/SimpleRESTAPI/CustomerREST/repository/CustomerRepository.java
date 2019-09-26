package com.codecool.SimpleRESTAPI.CustomerREST.repository;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;

public interface CustomerRepository {
    public Customer findById(int id);
    public Customer save(Customer customer);
}
