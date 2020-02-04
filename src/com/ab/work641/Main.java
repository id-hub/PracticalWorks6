package com.ab.work641;

public class Main {
    public static void main(String[] args) {

        int number = 637574;
        String result = "";
        while (number / 2 > 0) {
            if (number % 2 == 1) {
                result = "1" + result;
            } else {
                result = "0" + result;
            }
            if (number / 2 == 1) {
                result = "1" + result;
            }
            number /= 2;


        }
        System.out.println(result);
        System.out.println(number);


    }
}
