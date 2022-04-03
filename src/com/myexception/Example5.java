package com.myexception;

public class Example5 {
    static void checkEligibily(int sage, int sweight)
    {
        if(sage<12 && sweight<40)
        {
            throw new ArithmeticException("student is not eligible for registration");
        }
        else
            System.out.println("Student is eligible");
    }
    public static void main(String[] args) {
        checkEligibily(10,35);
    }
}


