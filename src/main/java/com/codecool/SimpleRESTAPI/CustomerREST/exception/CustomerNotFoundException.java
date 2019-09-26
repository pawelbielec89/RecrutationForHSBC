package com.codecool.SimpleRESTAPI.CustomerREST.exception;

class CustomerNotFoundException extends RuntimeException {

    CustomerNotFoundException(int id) {
        super("Could not find Customer " + id);
    }
}