package com.project1.academy.Exceptions;

public class EmailExistsException extends Exception {

    public EmailExistsException(String msg){
        super(msg);
    }


    private static final long serialVersionUID = 1L;
}
