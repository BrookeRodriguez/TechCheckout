package com.company;

public class Laptop
{
    private boolean is128;
    private boolean returned;

    Laptop (boolean is128GB)
    {
        is128 = is128GB;
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

    void returnLaptop ()
    {
        returned = true;
    }

    boolean isReturned ()
    {
        return returned;
    }
}
