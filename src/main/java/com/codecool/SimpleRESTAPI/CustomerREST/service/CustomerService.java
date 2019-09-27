package com.codecool.SimpleRESTAPI.CustomerREST.service;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;

public interface CustomerService {
    Customer getById(int id);

    Customer add(Customer customer);
}
