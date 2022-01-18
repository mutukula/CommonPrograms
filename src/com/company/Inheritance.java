package com.company;

class parent{
    public  parent(){
        System.out.println("Constructor one");
    }
    public void animal(){
        System.out.println("This is animal");
    }
}
class child extends parent{
    public child(){
        System.out.println("Constructor two");
    }
    public void animal1(){
        System.out.println("This is animal1");
    }
}
public class Inheritance {
    public static void main(String[] args){
        parent p = new parent();
        p.animal();
    }
}

