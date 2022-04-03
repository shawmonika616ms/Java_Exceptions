package com.company;

class Parent
{
    public void show()
    {
        System.out.println("Parent class method");
    }
}

class child extends Parent
{
    public void show()
    {
        System.out.println("child class method");
    }
}
public class Overriding  extends child{
    public static void main(String[] args) {
        Parent obj=new child();
        obj.show();
    }
}
