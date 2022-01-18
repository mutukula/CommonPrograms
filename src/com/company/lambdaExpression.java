package com.company;

public class lambdaExpression {
    @FunctionalInterface
    interface add{//if a interface have one method then we can call  it as functional interface
        void addMethod(int a,int b);
    }
    public static void main(String[] args){
        
        add ADD = (c,d) ->System.out.println(c+d);//Lambda implementation
    }
}
