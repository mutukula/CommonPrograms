package com.company;

import java.io.BufferedReader;
import java.io.*;

public class checkedException {

    public static void main(String[] args) {
        //  compiler raise an error if we don't handel an exception. let say we write code we complile application we may have possibility in getting exception
        //  IO exceptions comes under checkd exceptions
        try {
            FileReader file = new FileReader("demoCalculations");
            BufferedReader bf = new BufferedReader(file);
            for (int i = 0; i < 3; i++) {
                System.out.println(bf.readLine());
                bf.close();
            }
        }

        catch (Exception ex) {
            System.out.println("Exception Handled" + " " + ex);
        }
        finally{

        }
    }
}