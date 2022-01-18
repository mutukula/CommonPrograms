package com.company;

public class stringDetails {
    public static void main(String[] args) {
        // write your code here
       String s1 ="name";
       String s2 = s1;
       String s3= "name";
       if(s2==s3)
       {
           System.out.println("Both strings are equal");
       }
       else if(s2.equals(s3))
    {
           System.out.println("Both strings are equal by symbol");

       }
       else{
           System.out.println("Nothing Executed");
       }

    }
}
