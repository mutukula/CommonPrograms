package com.company;

public class Strings {
    public static void main(String[] args){
        String str1 = "yes";
        String Str = str1;
        if(str1 == Str){
            System.out.println("1");
        }
        if(str1.equalsIgnoreCase(Str)){
            System.out.println("2");
        }
    }
}
