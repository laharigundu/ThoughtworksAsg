package com.tw.assignment1;

import java.util.Scanner;
import java.lang.Exception;
class ExceptionHandling {
    static void solve(int[] arr) throws Exception {
        int ans = 0;

        for (int i = 0; i < 10; i++)
            for (int j = i + 1; j < 10; j++)
                ans += arr[i] / arr[j];

        throw new MyException(ans);
    }

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] arr = new int[n];
            in.nextLine();

            for (int i = 0; i < 10; i++)
                arr[i] = Integer.parseInt(in.nextLine());

            String s = in.nextLine();
            System.out.println(s.charAt(10));
            solve(arr);
        }
        catch(ArithmeticException arithmeticException) {
            System.out.println("Invalid Division");
        }
        catch(NumberFormatException numberFormatException) {
            System.out.println("Format mismatch");
        }
        catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            System.out.println("Index is invalid");
        }
        catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Array Index is invalid");
        }
        catch(MyException myException) {
            System.out.println(myException);
        }
        catch(Exception exception) {
            System.out.println("Exception Encountered");
        }
        finally {
            System.out.println("Exception Handling Completed");
        }
    }
}



