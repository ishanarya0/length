package com.example;

import static org.junit.Assert.assertEquals;
import com.example.CheckLength;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCheckLength()
    {
        CheckLength lengthObj= new CheckLength();

        String x1 = "2";
        String y1 = "4";
        String x2 = "3";
        String y2 = "5";
        Integer precise = 5;
        String returnedAns = lengthObj.findLength(x1,y1,x2,y2,precise);
        String expectedAns = "3.7417";
        assertEquals(expectedAns, returnedAns);
    }

    @Test
    public void testCheckLengthTwo()
    {
        CheckLength lengthObj= new CheckLength();

        String x1 = "0";
        String y1 = "0";
        String x2 = "4000";
        String y2 = "5000";
        Integer precise = 3;
        String returnedAns = lengthObj.findLength(x1,y1,x2,y2,precise);
        String expectedAns = "6.40E+3";
        assertEquals(expectedAns, returnedAns);
    }
}
