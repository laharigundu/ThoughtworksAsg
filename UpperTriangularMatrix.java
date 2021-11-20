package com.tw.assignment1;

import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] a = new int[size][size];
        boolean flag = true;
        for(int i = 0 ; i < size ; i++) {
            for(int j = 0 ; j < size ; j++) {
                a[i][j] = scan.nextInt();
                if(i <= j) {
                    if(a[i][j] == 0) {
                        flag = false;
                    }
                }
                else {
                    if(a[i][j] != 0) {
                        flag = false;
                    }
                }
            }
        }
        if(flag) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
