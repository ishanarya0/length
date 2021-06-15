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
        String expectedAns = "1.4142";
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

    @Test
    public void testCheckLengthThree()
    {
        CheckLength lengthObj= new CheckLength();

        String x1 = "0";
        String y1 = "0";
        String x2 = "-4000";
        String y2 = "-5000";
        Integer precise = 3;
        String returnedAns = lengthObj.findLength(x1,y1,x2,y2,precise);
        String expectedAns = "6.40E+3";
        assertEquals(expectedAns, returnedAns);
    }

    @Test
    public void testCheckLengthFour()
    {
        CheckLength lengthObj= new CheckLength();

        String x1 = "800";
        String y1 = "900";
        String x2 = "800";
        String y2 = "1000";
        Integer precise = 2;
        String returnedAns = lengthObj.findLength(x1,y1,x2,y2,precise);
        String expectedAns = "1.0E+2";
        assertEquals(expectedAns, returnedAns);
    }

    @Test
    public void testCheckLengthFive()
    {
        CheckLength lengthObj= new CheckLength();

        String x1 = "0";
        String y1 = "9";
        String x2 = "0";
        String y2 = "14";
        Integer precise = 7;
        String returnedAns = lengthObj.findLength(x1,y1,x2,y2,precise);
        String expectedAns = "5";
        assertEquals(expectedAns, returnedAns);
    }
}
