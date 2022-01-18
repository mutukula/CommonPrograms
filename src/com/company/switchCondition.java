package com.company;
import java.util.*;

public class switchCondition {
    public static void main(String[] args) {
        char name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character");
      String  string = scan.nextLine();
      name = string.charAt(0);
        switch(name)
        {
            case 'a':System.out.println("Case A executed");
                     break;
            case 'b': System.out.println("Case B executed");
                     break;
            case 'c': System.out.println("Case C executed");
                break;
            default:
                System.out.println("Enter option A B C");
                break;

        }

    }

}
