package com.example;
// import java.util.BufferedReader
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        CheckLength obj = new CheckLength();
        String x1 = "0";
        String y1 = "9";
        String x2 = "0";
        String y2 = "12";
        int precision = 2;
        System.out.println(obj.findLength(x1, y1, x2, y2, precision));
    }
}
