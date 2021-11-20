package com.tw.assignment1;

import java.util.Scanner;

public class GetSalary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[7];
        int hours = 0;
        for(int i = 0 ; i < 7 ; i++) {
            a[i] = scan.nextInt();
            hours = hours + a[i];
        }
        hours  = hours - a[0] - a[6];
        int salary = 0;
        for(int i = 0 ; i < 7 ;i++) {
            if(a[i] > 8) {
                int d = a[i] - 8;
                salary = salary + d * 15;
            }
            salary += a[i] * 100;
        }
        if(hours > 40) {
            int d = hours - 40;
            salary += d * 25;
        }
        if(a[0] != 0) {
            int sum = (a[0] * 100 * 50) / 100;
            salary += sum;
        }
        if(a[6] != 0) {
            int sum = (a[6] * 100 * 25) / 100;
            salary += sum;
        }
        System.out.println("Salary : " + salary);
    }
}
