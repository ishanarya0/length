package com.example;
// import java.util.BufferedReader
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        CheckLength obj = new CheckLength();
        String x1 = "800";
        String y1 = "900";
        String x2 = "800";
        String y2 = "1000";
        int precision = 8;
        System.out.println(obj.findLength(x1, y1, x2, y2, precision));
    }
}
