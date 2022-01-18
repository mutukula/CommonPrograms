package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringDivision {
    public static void main(String[] args){
        String s ="descognail";
        int j = 0;
        String temp1;
        String subString = null;
        int sizes[] = {3,2,3,1,1};
        for(int i =0; i<= sizes.length-1;i++){
            if(s!=null){
                int markUP=  sizes[i];
             List<String> temp = Collections.singletonList(s.substring(j, j + markUP));
            String AfterSwaping= swaping(temp);
            System.out.println(AfterSwaping);
             j=j+markUP;
           subString=temp.toString();
           subString = subString.concat(",");
             // System.out.print(subString);
            }
        }
    }
    public static String swaping(List<String> Swap) {
        String afterSwaping = null;
        String temp1= null;
        if(Swap!=null){
            for(int i=0;i<=5;i++){
                for(int j=1;j<=5;j++){
                    String temp = String.valueOf(Swap.indexOf(i));
                     temp1 = temp;
                    afterSwaping = String.valueOf(Swap.indexOf(j));
                }
            }
        }
        return afterSwaping.concat(temp1);
    }
}


/*
    You are given a string s, and an array of positive integers sizes, where the sum of all the elements of sizes is equal to the length of s.  More formally, sizes[0] + sizes[1] + ... +  sizes[sizes.length - 1] = s.length.
        Your task is to: Split the given string s into substrings of lengths sizes[0], sizes[1], ... , sizes[sizes.length - 1] respectively;
        Swap the obtained substrings in pairs: swap the first substring with  the second one, the third substring with the fourth one, etc.  If the number of substrings is odd, leave the last substring in place.
        Concatenate the swapped substrings back into one string, and return  the resulting string as the answer. Example
        For s = "descognail" and sizes = [3, 2, 3, 1, 1], the output  should be concatSwaps(s, sizes) = "codesignal".

        Des, co , gna  i, l
        Co , des, i, gna, l
        codesignal


        String s =”descognail”;
        Int sizes[] =*/
