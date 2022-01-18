package com.company;

public class exceptionHandling {
    public static void main(String[] args) {

            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (Exception e) {
                System.out.println(e);
                e.printStackTrace();//shows exception at the method

            }
            finally{
                System.out.println("Final block executed");
            }

    }
}