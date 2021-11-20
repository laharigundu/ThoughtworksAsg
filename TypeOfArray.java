package com.tw.assignment1;

import java.util.Scanner;

public class TypeOfArray {
    public int findTypeOfArray(int[] a , int size) {
        int even = 0 , odd = 0 ;
        for(int i = 0 ; i < size ; i++) {
            if(a[i] % 2 == 0) {
                even++;
            }
            if(a[i] % 2 != 0) {
                odd++;
            }
        }
        if(even == size) {
            return 1;
        }
        else if(odd == size) {
            return 2;
        }
        else {
            return 3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for(int i = 0 ; i < size ; i++) {
            a[i] = sc.nextInt();
        }
        TypeOfArray typeOfArray = new TypeOfArray();
        int value = typeOfArray.findTypeOfArray(a , size);
        if(value == 1) {
            System.out.println("Even");
        }
        else if(value == 2) {
            System.out.println("Odd");
        }
        else {
            System.out.println("Mixed");
        }
    }
}
