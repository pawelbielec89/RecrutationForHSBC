package com.codecool.SimpleRESTAPI.CustomerREST.controller;

import com.codecool.SimpleRESTAPI.CustomerREST.exception.CustomerNotFoundException;
import com.codecool.SimpleRESTAPI.CustomerREST.exception.InvalidCustomerIdException;
import com.codecool.SimpleRESTAPI.CustomerREST.exception.WrongJSONFormatException;
import com.codecool.SimpleRESTAPI.CustomerREST.model.Address;
import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import com.codecool.SimpleRESTAPI.CustomerREST.service.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerControllerImpl implements CustomerController {

    private final CustomerServiceImpl service;

    public CustomerControllerImpl(CustomerServiceImpl service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getById(@PathVariable int id) {
        if (id < 1) {
            throw new InvalidCustomerIdException(id);
        }
        if (service.getById(id) == null) {
            throw new CustomerNotFoundException(id);
        }
        return new ResponseEntity<Customer>(service.getById(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/add")
    public ResponseEntity<Customer> add(@RequestBody Customer customer) {
        if (customerIsValid(customer)) {
            return new ResponseEntity<Customer>(service.add(customer), HttpStatus.CREATED);
        } else {
            throw new WrongJSONFormatException();
        }
    }

    private boolean customerIsValid(Customer customer) {
        return isValid(customer.getCustomerAddress()) &&
                isValid(customer.getName()) &&
                isValid(customer.getCustomerAddress().getCity()) &&
                isValid(customer.getCustomerAddress().getStreet()) &&
                isValid(customer.getCustomerAddress().getZipCode());
    }

    private boolean isValid(String str) {
        return str != null && !str.equals("");
    }

    private boolean isValid(Address address) {
        return address != null;
    }
}
