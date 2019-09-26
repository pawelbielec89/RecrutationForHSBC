package com.codecool.SimpleRESTAPI.CustomerREST.exception;

class WrongJSONFormatException extends RuntimeException {

    WrongJSONFormatException() {
        super("JSON format doesn't match Customer");
    }
}