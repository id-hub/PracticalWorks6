package com.ab.work61;

public class Main {

    public static void main(String[] args) {
        double area = areaTriangle(3, 4, 5);
        System.out.println("area1 = " + area);
        System.out.println("area2 = " + String.format("%.4f", areaTriangle(6, 5, 9)));

    }

    public static double areaTriangle(double a, double b, double c) {
//        double area = 0.0;
        double per = (a + b + c) / 2;
//        double area = Math.sqrt(per * (per - a) * (per - b) * (per - c));

//        return area;
        return Math.sqrt(per * (per - a) * (per - b) * (per - c));
    }
}
