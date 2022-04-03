package com.company;


class Encapsulation
{
    private int num;
    private String name;

    public int getdata()
    {
        return num;
    }

    public String getdata1()
    {
        return name;
    }

    public void setvalue(int n)
    {
        num=n;
    }
    public void setvalue1(String nm)
    {
        name=nm;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Encapsulation obj=new Encapsulation();
        obj.setvalue(10);
        obj.setvalue1("ajay");
        System.out.println(obj.getdata());
        System.out.println(obj.getdata1());
    }
}
