package com.codecool.SimpleRESTAPI.CustomerREST.repository;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;

public interface CustomerRepository {
    Customer findById(int id);

    Customer save(Customer customer);
}
