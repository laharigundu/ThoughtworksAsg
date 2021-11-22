package com.tw.assignment1;

public class MyException extends Exception{
    int userData;
    MyException(int message) {
        userData = message;
    }
    public String toString() {
        return "MyException[" + userData + "]";
    }
}
