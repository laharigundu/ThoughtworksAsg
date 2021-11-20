package com.tw.assignment1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int treeNumber = sc.nextInt();
            if(treeNumber <= columns) {
                System.out.println("Yes");
            }
            else if(treeNumber % columns == 1 || treeNumber % columns == 0 && (treeNumber <= rows * columns)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
    }

    /*  Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[3];
        int min = Integer.MAX_VALUE , Lab = -1;

        a[0] = x - n;
        a[1] = y - n;
        a[2] = z - n;
        for(int i = 0 ; i < 3 ; i++) {
            if(min > a[i] && a[i] >= 0) {
                min = a[i];
                Lab = i;
            }
        }
        if(x < 0 && y < 0 && z < 0) {
            System.out.println("Not Possible");
        }
        else if(Lab == 0) {
            System.out.println("L1");
        }
        else if(Lab == 1) {
            System.out.println("L2");
        }
        else if(Lab == 2) {
            System.out.println("L3");
        }
        else {
            System.out.println("Not Possible");
        }
        */
}
