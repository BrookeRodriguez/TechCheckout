package com.company;

public class Main {

    public static void main(String[] args)
    {
        LaptopList test = new LaptopList();
        test.addLaptop("Johnny", false);
        test.addLaptop("A", false);
        test.addLaptop("B", false);
        test.addLaptop("C", false);
        test.addLaptop("Johnny", true);
        test.returnLaptop("Johnny");
        test.returnLaptop("Johnny");
        test.returnLaptop("Mary");
        test.addLaptop("Johnny", false);
    }
}
