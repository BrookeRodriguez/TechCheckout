package com.company;

public class LoanObject
{
    private Student person;
    private Charger loanedCharger;
    private Laptop loanedLaptop;

    LoanObject (Student student, Charger charger)
    {
        person = student;
        loanedCharger = charger;
        loanedLaptop = null;
    }

    LoanObject (Student student, Laptop laptop)
    {
        person = student;
        loanedCharger = null;
        loanedLaptop = laptop;
    }

    String getStudentName ()
    {
        return person.getName();
    }

    Laptop getLoanedLaptop ()
    {
       return loanedLaptop;
    }

    Charger getLoanedCharger ()
    {
        return loanedCharger;
    }

    //This will contain the transaction methods
}