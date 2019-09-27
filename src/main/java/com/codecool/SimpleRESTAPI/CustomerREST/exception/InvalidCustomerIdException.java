package com.codecool.SimpleRESTAPI.CustomerREST.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidCustomerIdException extends RuntimeException {

    public InvalidCustomerIdException(int id) {
        super("Id of " + id + "is not a positive integer");
    }
}