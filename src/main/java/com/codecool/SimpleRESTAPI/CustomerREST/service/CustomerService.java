package com.codecool.SimpleRESTAPI.CustomerREST.service;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;

public interface CustomerService {
    public Customer getById(int id);

    public Customer add(Customer customer);
}
