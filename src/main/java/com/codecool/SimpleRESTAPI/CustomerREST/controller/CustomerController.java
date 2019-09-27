package com.codecool.SimpleRESTAPI.CustomerREST.controller;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import org.springframework.http.ResponseEntity;

public interface CustomerController {
    ResponseEntity<Customer> getById(int id);

    ResponseEntity<Customer> add(Customer customer);
}
