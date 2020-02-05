package com.ab.work65;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of pyramid -> ");
        int number = sc.nextInt();
        printPyramid(number);
    }

    public static void printPyramid(int height) {
        int row = 1;
        while (row <= height) {
            String result = "" + row;
            int col = 1;
            while (col < height) {
                if (col < row) {
                    result = (row - col) + result + (row - col);
                } else {
                    result = " " + result + " ";
                }
                col++;
                if (col == height) {
                    System.out.println(result);
                }
            }
            row++;
        }
    }
}
