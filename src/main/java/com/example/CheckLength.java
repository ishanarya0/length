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
        BigDecimal delta_x = x1_bigdeci.subtract(x2_bigdeci).abs();
        BigDecimal delta_y = y1_bigdeci.subtract(y2_bigdeci).abs();
        BigDecimal square_x = delta_x.multiply(delta_x);
        BigDecimal square_y = delta_y.multiply(delta_y);
        BigDecimal length = (square_x.add(square_y)).sqrt(precision);
        return length.toString();
    }
}
