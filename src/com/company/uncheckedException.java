package com.company;

public class uncheckedException {
    public static void main(String[] args) {

        try {
            System.out.println("going to divide");
            int b = 39 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
//runtime exception
    }
}
