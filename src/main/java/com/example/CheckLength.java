package com.example;
import java.math.BigDecimal;
import java.math.MathContext;
public class CheckLength {
    public String findLength(String x1, String y1, String x2, String y2, int precise){
        BigDecimal x1_bigdeci = new BigDecimal(x1);
        BigDecimal y1_bigdeci = new BigDecimal(y1);
        BigDecimal x2_bigdeci = new BigDecimal(x2);
        BigDecimal y2_bigdeci = new BigDecimal(y2);
        MathContext precision = new MathContext(precise);
        BigDecimal square_x = (x1_bigdeci.multiply(x1_bigdeci)).subtract(x2_bigdeci.multiply(x2_bigdeci));
        BigDecimal square_y = (y1_bigdeci.multiply(y1_bigdeci)).subtract(y2_bigdeci.multiply(y2_bigdeci));
        square_x = square_x.abs();
        square_y = square_y.abs();
        BigDecimal length = (square_x.add(square_y)).sqrt(precision);
        return length.toString();
    }
}
