package com.company;

class Animal
{
    int id;
    String name;
    Animal(int i, String n)
    {
        id=i;
        name=n;
    }

    public void show()
    {
        System.out.println(id+ " "+name);
    }
    public void color(String col)
    {
        System.out.println(col);
    }
}

class Voice extends Animal
{
    Voice()
    {
        super(10,"hello");


    }
    public  void sound(String s)
    {
        System.out.println(s);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Voice ob=new Voice();
        ob.show();
        ob.color("REd");
        ob.sound("Bark");
    }
}
