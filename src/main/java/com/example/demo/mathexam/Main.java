package com.example.demo.mathexam;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("Sum: " + sum);
        while(true) {
            sum++;
        }
    }

    public static int add(int x, int y) {
        return x + y;
    }




}
