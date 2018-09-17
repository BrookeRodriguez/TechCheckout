package com.company;
import java.io.*;
import java.util.*;

public class ChargerList
{
    private Stack <Charger> chargerStack;

    ChargerList ()
    {
        chargerStack = new Stack<>();
    }

    void addCharger (String name, boolean is61Watt)
    {
        for(Charger charger : chargerStack)
        {
            if (charger.getStudentName().equals(name) && !(charger.isReturned()))
            {
                System.out.println("Student already has a charger.");
                return;
            }
        }

        chargerStack.push(new Charger(is61Watt, name));

        System.out.println("Charger is taken.");
    }

    void returnCharger (String name)
    {
        for(Charger charger : chargerStack)
        {
            if (charger.getStudentName().equals(name) && !(charger.isReturned()))
            {
                charger.returnCharger();

                System.out.println("Charger is returned.");

                return;
            }
        }

        System.out.println("Charger has been returned or hasn't been taken.");
    }

}
