package com.codecool.SimpleRESTAPI.CustomerREST.service;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import com.codecool.SimpleRESTAPI.CustomerREST.repository.CustomerRepository;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer getById(int id) {
        return repository.findById(id);
    }

    @Override
    public Customer add(Customer customer) {
        return repository.save(customer);
    }
}
