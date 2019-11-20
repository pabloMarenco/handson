package com.example.handson.exception;

public class ContractTypeNotValidException extends RuntimeException {
    public ContractTypeNotValidException(){
        super("No contract type supported");
    }
}


