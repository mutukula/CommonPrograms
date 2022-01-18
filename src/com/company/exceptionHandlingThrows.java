package com.company;

public class exceptionHandlingThrows {

    void  compare() throws  ArithmeticException{//exceptions rasied during multiple method calling can be handled using throws method
        int i=1;
        int j=0;
        int k=i/j;
    }
    void exception(){
        try
        {
            compare();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        exceptionHandlingThrows exp = new exceptionHandlingThrows();
        exp.exception();
    }
}
