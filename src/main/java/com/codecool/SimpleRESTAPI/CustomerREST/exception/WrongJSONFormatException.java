package com.codecool.SimpleRESTAPI.CustomerREST.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class WrongJSONFormatException extends RuntimeException {

    public WrongJSONFormatException() {
        super("JSON format doesn't match Customer");
    }
}