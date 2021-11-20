package com.tw.assignment1;

import java.util.Scanner;

public class ComputeRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
        for(int i = 0 ; i < size ; i++) {
            a[i] = scan.nextInt();
            if(max < a[i]) {
                max = a[i];
            }
            if(min > a[i]) {
                min = a[i];
            }
        }
        int range = max - min;
        System.out.println("Range :" + range);
    }
}
