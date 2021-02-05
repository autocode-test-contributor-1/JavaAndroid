package com.example.javaandroid;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CalcTest {
    private Calc calc;

    @Test
    public void calc_add_isCorrect() {
        calc = new Calc();
        assertEquals(4.0, calc.add(2.0, 2.0), 0.1);
    }
    @Test
    public void calc_subtract_isCorrect() {
        calc = new Calc();
        assertEquals(1.0, calc.subtract(3.0, 2.0), 0.1);
    }
    @Test
    public void calc_multiply_isCorrect() {
        calc = new Calc();
        assertEquals(12.0, calc.multiply(6.0, 2.0), 0.1);
    }
    @Test
    public void calc_divide_isCorrect() {
        calc = new Calc();
        assertEquals(1.0, calc.divide(2.0, 2.0), 0.1);
        assertEquals(0.0, calc.divide(2.0, 0.0), 0.1);
    }
}