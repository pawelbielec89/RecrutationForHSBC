package com.codecool.SimpleRESTAPI.CustomerREST.exception;

class InvalidCustomerIdException extends RuntimeException {

    InvalidCustomerIdException(int id) {
        super("Id of " + id + "is not a positive integer");
    }
}