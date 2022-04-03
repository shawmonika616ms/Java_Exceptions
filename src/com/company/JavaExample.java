package com.company;

public class JavaExample {
    public static void main(String[] args) {



        JavaExample a=new JavaExample();
        JavaExample b=new JavaExample();
        a=null;
        b=null;
        System.gc();
    }
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collection");
    }
}
