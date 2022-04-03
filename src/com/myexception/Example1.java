package com.myexception;

public class Example1 {

    public static void main(String[] args) {
        int n1,n2;

        try
        {
            int a[]=new int[2];
            a[2]=5;
            System.out.println(a[2]);
            n1=0;
            n2=60/n1;
            System.out.println(n2);


        }
        catch (ArithmeticException e)
        {
            System.out.println("you should not divide by zero");
        }
        catch (Exception e)
        {
            System.out.println("exception handled");
        }
    }
}
