package com.company;

import org.jetbrains.annotations.NotNull;

public class execeptionHandlingThrowKeyboard {

    static int compare(int age) {
        Integer b= 6;
        try {
            if (b > age) {
               //int j = b / age;//tp hand over our created exception object to the JVM manually
                throw new invalidStatementException("Explicit ExceptionHandled");//In our program indicates that something goes wrong we can use explicit exception
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        return b;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        compare(0);
    }
}
