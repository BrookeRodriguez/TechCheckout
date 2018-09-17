package com.company;


public class Charger
{
    private boolean is61;
    private boolean returned;
    private String studentName;

    Charger(boolean is61Watts, String nameOfStudent)
    {
        is61 = is61Watts;
        studentName = nameOfStudent;
    }

    int getWattage()
    {
        if (is61)
        {
           return 61;
        }

        return 87;
    }

    void setWattage (boolean is61Watts)
    {
        is61 = is61Watts;
    }

    void returnCharger ()
    {
        returned = true;
    }

    boolean isReturned ()
    {
        return returned;
    }

    void setStudentName (String name)
    {
        studentName = name;
    }

    String getStudentName()
    {
        return studentName;
    }
}