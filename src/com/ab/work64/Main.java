package com.ab.work64;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int num = sc.nextInt();
        if (num < 0) {
            num = -num;
        }
        if (num == 0 || num == 1) {
            System.out.println("Bin number = " + num);
        } else {
            System.out.println("Bin number = " + convertDecimalToBinary(num));
        }

    }

    public static String convertDecimalToBinary(int number) {
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
        return result;
    }

}

//
//        int number = 637574;
//        String result = "";
//        while (number / 2 > 0) {
//           if (number % 2 == 1) {
//           result = "1" + result;
//            } else {
//               result = "0" + result;
//           }
//           if (number / 2 == 1) {
//               result = "1" + result;
//            }
//            number /= 2;
//        }
//        System.out.println(result);
//        System.out.println(number);
//}
