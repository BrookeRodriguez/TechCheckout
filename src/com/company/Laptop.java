package com.company;

public class Laptop
{
    private boolean is128;
    private boolean returned;
    private String studentName;

    Laptop (boolean is128GB, String nameOfStudent)
    {
        is128 = is128GB;
        studentName = nameOfStudent;
    }

    int getStorage ()
    {
        if (is128)
        {
            return 128;
        }

        return 256;
    }

    void setStorage (boolean is128GB)
    {
        is128 = is128GB;
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
