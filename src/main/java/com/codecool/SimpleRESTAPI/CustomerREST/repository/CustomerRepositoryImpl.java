package com.codecool.SimpleRESTAPI.CustomerREST.repository;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerRepositoryImpl implements CustomerRepository{

    private final Map<Integer, Customer> customers;

    public CustomerRepositoryImpl() {
        customers = new HashMap<>();
    }

    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public Customer save(Customer customer) {
        int generatedId = generateId();
        Customer customerToSave = new Customer(generatedId, customer.getName(), customer.getCustomerAddress());
        customers.put(generatedId, customerToSave);
        return customerToSave;
    }

    private int generateId() {
        return customers.keySet().stream().mapToInt(id -> id).max().orElse(0) +1;
    }
}
