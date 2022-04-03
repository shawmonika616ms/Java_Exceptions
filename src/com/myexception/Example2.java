package com.myexception;

public class Example2 {
    public static void main(String[] args) {
        int n1,n2,a1,a2;
        try
        {
            n1 = 10;
            n2 = 60 / n1;
            System.out.println(n2);
            try {


                int a[] = new int[2];
                a[2] = 5;
                System.out.println(a[2]);

            }

            catch (Exception e)
            {
                System.out.println("Cathed");
            }

            try {

               a1=0;
                a2 = 50 / a1;
                System.out.println(n2);
            }

            catch (ArithmeticException e)
            {
                System.out.println("Child Arithmetic exception catched");
            }

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
