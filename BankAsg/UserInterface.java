package com.tw.assignment1;

public class UserInterface {
    public static void main(String[] args) {
        BharatBank[] bharatBank = new BharatBank[2];
        bharatBank[0] = new BharatBank(50000 , "Current Account");
        bharatBank[1] = new BharatBank(100000 , "Savings Account");

        bharatBank[0].deposit( 10000);
        bharatBank[1].withdrawal(45000);

        bharatBank[0].withdrawal(70000);
        bharatBank[1].withdrawal(65000);

        for(int i = 0 ; i < 2 ; i++) {
            if(bharatBank[i].getTypeOfAccount().equals("Current Account")) {
                System.out.println(bharatBank[i].getBalance());
            }
            else {
                System.out.println(bharatBank[i].getBalance() + bharatBank[i].getInterest());
            }
        }
    }
}
