package com.example.android.simplecalculator;

import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;

    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

/*    @Test
    public void addTwoPositiveDoubles() {
        assertEquals(5, mCalculator.add(2.0, 3.0), 0);
    }

    @Test
    public void addTwoNegativeDoubles() {
        assertEquals(-3d, mCalculator.add(-2d, -1d), 0);
    }

    @Test
    public void addTwoFloats() {
        assertEquals(2.222, mCalculator.add(1.111f, 1.111f), 0.002);
    }

    @Test
    public void subTwoDoubles() {
        assertEquals(2d, mCalculator.sub(3d, 1d), 0);
    }

    @Test
    public void subTwoNegativeDoubles() {
        assertEquals(-16d, mCalculator.sub(1d, 17d), 0);
    }

    @Test
    public void mulTwoDoubles() {
        assertEquals(30d, mCalculator.mul(3d, 10d), 0);
    }

    @Test
    public void divTwoDoubles() {
        assertEquals(2d, mCalculator.div(32d, 16d), 0);
    }

    @Test
    public void divDoubleWithZero() {
        assertEquals(Double.POSITIVE_INFINITY, mCalculator.div(22d, 0), 0);
    }*/

    @Test
    public void powPositiveInteger() {
        assertEquals(9, mCalculator.pow(3, 2), 0);
    }

    @Test
    public void powNegativeFirstInteger() {
        assertEquals(-27, mCalculator.pow(-3, 3), 0);
    }

    @Test
    public void powNegativeSecondInteger() {
        assertEquals(0.25, mCalculator.pow(2, -2), 0);
    }

    @Test
    public void powZeroFirstPositiveSecondInteger() {
        assertEquals(0, mCalculator.pow(0, 7), 0);
    }

    @Test
    public void powPositiveFirstZeroSecondInteger() {
        assertEquals(1, mCalculator.pow(134, 0), 0);
    }

    @Test
    public void powZeroFirstNegativeOneSecond() {
        assertEquals(Double.POSITIVE_INFINITY, mCalculator.pow(0, -1), 0);
    }

    @Test
    public void powNegativeZeroFirstNegativeIntegerSecond() {
        assertEquals(Double.NEGATIVE_INFINITY, mCalculator.pow(-0d, -1), 0);
    }

}