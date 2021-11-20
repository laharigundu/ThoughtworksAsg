package com.tw.assignment1;

import java.util.Scanner;

public class GenerateSequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int countOperations = 0;
        while(number != 1) {
            System.out.print(number + " ");
            if(number % 2 == 0) {
                number = number / 2;
            }
            else {
                number = 3 * number + 1;
            }
            countOperations++;
        }
        System.out.print(number + " " + countOperations);
    }
}
