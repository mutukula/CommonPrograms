package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import com.company.MathOperation;

public class fileHandingInException {
    public static void main(String[] args) {
     /*   try(BufferedReader reader=  new BufferedReader(new FileReader(args[0]))){
            String inputLine = null;
            while((inputLine = reader.readLine())!= null)
                performOperation(inputLine);
        }catch(Exception Ex){
            System.out.println("Error message"+ Ex.getMessage());
        }
    }
    private static void performOperation(String inputLine){
        String[] parts = inputLine.split("");
       // MathOperation operation =MathOperation.valueOf(parts[0],toUpperCase());
        int leftval = valueFromWord(parts[1]);
        int rightval = valueFromWord(parts[2]);
        //int result = execute(operation, leftval, rightval);
        System.out.println("inputLine" + " = "+"+result");
    }
    static int execute(MathOperation operation, int leftval, int rightval){
        int result = 0;
        switch(operation){
            case "ADD":
                result = leftval + rightval;
                break;
            case "SUBTRACT":
                result = leftval + rightval;
                break;
            case "MULTIPLY":
                result = leftval + rightval;
                break;
            case "DIVIDE":
                result = leftval + rightval;
                break;
        }
        return result;
    }
 static int valueFromWord(String word){
        String[] numberWords ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int value = -1;
        for(int index=0;index<numberWords.length; index++){
            if(word.equals(numberWords[index])){
                value = index;
                break;
            }
        }
        if(value== -1d)
        {
            value = Integer.parseInt(word);
            return value;
        }*/
 }

}
