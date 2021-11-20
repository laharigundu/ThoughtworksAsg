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

}
