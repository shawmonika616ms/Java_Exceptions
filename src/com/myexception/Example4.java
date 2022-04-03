package com.myexception;

public class Example4 {
    public static void main(String[] args) {


        try
        {
            int a[]=new int[2];
            a[2]=5;
            System.out.println(a[2]);



        }
        catch (ArithmeticException e)
        {
            System.out.println("you should not divide by zero");
        }
        catch (Exception e) {
            System.out.println("exception");
        }

        finally {
            System.out.println("Always executed");
        }
    }
}
