package com.tw.assignment1;

public class BharatBank {
    private int balance;
    private String TypeOfAccount;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public String getTypeOfAccount() {
        return TypeOfAccount;
    }

    public void setTypeOfAccount(String typeOfAccount) {
        TypeOfAccount = typeOfAccount;
    }

    BharatBank(int balance , String TypeOfAccount) {
        setBalance(balance);
        setTypeOfAccount(TypeOfAccount);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdrawal(int amount) {
        if(this.balance >= amount ){
            this.balance -= amount;
        }
        else if(this.getTypeOfAccount().equals("Current Account")) {
            double overdraft = this.balance * 0.2;
            if(overdraft + this.balance >= amount) {
                this.balance -= amount;
            }
            else {
                System.out.println("No sufficient balance");
            }
        }
        else {
            System.out.println("No sufficient balance");
        }
    }

    public double getInterest() {
        return this.getBalance() * 0.03 * (float) 1 / 4;
    }
}
