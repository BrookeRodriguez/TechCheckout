package com.company;

import java.util.Stack;

public class LaptopList
{
    private Stack<Laptop> laptopStack;

    LaptopList ()
    {
        laptopStack = new Stack<>();
    }

    void addLaptop (String name, boolean is128GB)
    {
        for(Laptop laptop : laptopStack)
        {
            if (laptop.getStudentName().equals(name) && !(laptop.isReturned()))
            {
                System.out.println("Student already has a laptop.");
                return;
            }
        }

        laptopStack.push(new Laptop(is128GB, name));

        System.out.println("Laptop is taken.");
    }

    void returnLaptop (String name)
    {
        for(Laptop laptop : laptopStack)
        {
            if (laptop.getStudentName().equals(name) && !(laptop.isReturned()))
            {
                laptop.returnCharger();

                System.out.println("Laptop is returned.");
                return;
            }
        }

        System.out.println("Laptop has been returned or hasn't been taken.");
    }
}
