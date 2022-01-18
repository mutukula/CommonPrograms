package com.company;

import java.util.ArrayList;
import java.util.*;

public class forEachLoop {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of names to be updated");
        String name = scan.nextLine();
        int j = Integer.parseInt(name);
        for(int i=0;i<=j;i++)
        {
            System.out.println("Enter name");
            String Firstname = scan.nextLine();
            arr.add(Firstname);
        }
        for (Object updatedName:arr) {
            System.out.println("Updated name is"+ " "+updatedName);
        }




    }
}
