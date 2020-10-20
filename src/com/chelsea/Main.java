package com.chelsea;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello CareerDevs!");
        Car myCar = new Car("Blue", "Subaru", "1234", 2021);
        System.out.println(myCar.model);
        myCar.model = "Roadster X";
        System.out.println(myCar.model);
        System.out.println(myCar.toString());
        myCar.displayDetails();
    }
}
