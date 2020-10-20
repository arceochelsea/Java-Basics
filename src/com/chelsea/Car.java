package com.chelsea;

public class Car {

    public String model;
    private String color;
    private String vin;
    private int tireCount;
    private int year;
    private boolean isOn = false;
    //declaration on the left definition on the right!

    //public Cars and params is the declaration
    public Car(String color, String model, String vin, int tireCount, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = tireCount;
        this.year = year;
        isOn = false;
        //12 - 17 is the definition
    }

    public Car(String color, String model, String vin, int year) {
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.year = year;
        isOn = false;
    }

    //try and find if return so no indentation
    //keep indentation as low as possible!
    public void drive() {
        if (!isOn) {
            System.out.println("Turn the car on first!!");
            return;
        }
        System.out.println("Moving!");
    }

    //setters should have logic in them!
    //if you have a getter & setter with a public field then it is a waste of time!
    public void setOn(boolean on){
        if( isOn && on) {
            System.out.println("Screech!!");
            return;
        }
        if (!isOn && !on) {
            System.out.println("Radio starting");
        }
        isOn = on;
    }

    public void toggleOn() {
        isOn = !isOn;
    }

    public void displayDetails() {
        System.out.printf("You are driving a %s, %n, %s", color, year, model);
    }

    @Override
    public String toString(){
        return "You are driving a " + color + " " + year + " " + model + ".";
    }


}
