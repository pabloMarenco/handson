package com.example.handson.exception;

public class NotValidIDException extends RuntimeException {
    public NotValidIDException(){
        super("ID not found");
    }
}


