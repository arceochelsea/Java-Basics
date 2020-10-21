package com.chelsea;

public class Main {

    public static void main(String[] args) {
       BankAccount myAcct = new BankAccount(100000, "Phil", "1234", "Account");
       CheckingAccount myChecking = new CheckingAccount(20000, "Chelsea", "9876", 10000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.deposit(1000);
        myChecking.deposit(2000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(10000);
        myChecking.withdraw(5000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.withdraw(100000000);
        myChecking.withdraw(6000);
        myChecking.withdraw(4000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());

    }
}
