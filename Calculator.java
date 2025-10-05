package org.example;

public class Calculator {

    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args){
        int a = 10;
        int b = 20;
        Calculator calculator = new Calculator();
        calculator.add(a,b);
        calculator.sub(a,b);
    }
}
