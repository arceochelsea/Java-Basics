package com.chelsea;

public class BankAccount {
    private int balance;
    private String owner;
    private String accountNum;
    private String type;

    public BankAccount(int balance, String owner, String accountNum, String type){
        this.balance = balance;
        this.owner = owner;
        this.accountNum = accountNum;
        this.type = type;
    }

    public void deposit(int amt){
        if (amt > 0) {
            balance += amt;
        }
    }

    public void withdraw(int amt){
        if (amt <= balance) {
            balance -= amt;
        }
    }

    @Override //optional flag
    public String toString() {
        return "type: " + type + "\tAccountNum: " + accountNum + "\tOwner: " + owner + "\tbalance: " + balance;
    }

}
