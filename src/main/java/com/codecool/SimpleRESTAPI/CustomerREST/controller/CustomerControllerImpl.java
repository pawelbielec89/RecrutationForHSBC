package com.codecool.SimpleRESTAPI.CustomerREST.controller;

import com.codecool.SimpleRESTAPI.CustomerREST.model.Customer;
import com.codecool.SimpleRESTAPI.CustomerREST.service.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerControllerImpl implements CustomerController {
    
    private final CustomerServiceImpl service;

    public CustomerControllerImpl(CustomerServiceImpl service){
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Customer> getById(@PathVariable int id) {
    return new ResponseEntity<Customer>(service.getById(id), HttpStatus.OK);
}

    @RequestMapping(value = "/add")
    public ResponseEntity<Customer> add(@RequestBody Customer customer) {
        return new ResponseEntity<Customer>(service.add(customer), HttpStatus.CREATED);
    }

}
