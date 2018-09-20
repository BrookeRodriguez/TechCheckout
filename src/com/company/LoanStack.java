package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class LoanStack
{
    private Queue<LoanObject> loanObjects = import java.util.LinkedList;

    void addObject (String name, boolean is128GB, boolean isLaptop, boolean is61Watt)
    {
        if (isLaptop)
        {
            for(LoanObject loanObject : loanObjects)
            {
                if (loanObject.getStudentName().equals(name) && (!(loanObject.getLoanedLaptop().isReturned()) || loanObject.getLoanedLaptop() == null))
                {
                    System.out.println("Student already has a laptop.");
                    return;
                }
            }

            loanObjects.add(new LoanObject(new Student(name), new Laptop(is128GB)));
            System.out.println("Laptop is taken.");
        }


        else
        {
            for(LoanObject loanObject : loanObjects)
            {
                if (loanObject.getStudentName().equals(name) && (!(loanObject.getLoanedCharger().isReturned()) || loanObject.getLoanedLaptop() == null))
                {
                    System.out.println("Student already has a charger.");
                    return;
                }
            }

            loanObjects.add(new LoanObject(new Student(name), new Charger(is61Watt)));

            System.out.println("Charger is taken.");
        }



    }

    void returnObject (String name, boolean isLaptop)
    {
        if (isLaptop)
        {
            for(LoanObject loanObject : loanObjects)
            {
                if (loanObject.getStudentName().equals(name) && (!(loanObject.getLoanedLaptop().isReturned()) || loanObject.getLoanedLaptop() == null))
                {
                    loanObject.getLoanedLaptop().returnLaptop();

                    System.out.println("Laptop is returned.");
                    return;
                }
            }

            System.out.println("Laptop has been returned or hasn't been taken.");
        }

        else
        {
            for(LoanObject loanObject : loanObjects)
            {
                if (loanObject.getStudentName().equals(name) && (!(loanObject.getLoanedCharger().isReturned()) || loanObject.getLoanedCharger() == null))
                {
                    loanObject.getLoanedCharger().returnCharger();

                    System.out.println("Charger is returned.");

                    return;
                }
            }

            System.out.println("Charger has been returned or hasn't been taken.");
        }
    }
}
