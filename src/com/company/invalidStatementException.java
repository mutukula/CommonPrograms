package com.company;

public class invalidStatementException extends Exception {//can create custom exception there are time where buildin exceptions do not help in that scenarios we can create an exception
    public invalidStatementException(String message){
        super(message);
    }
}
