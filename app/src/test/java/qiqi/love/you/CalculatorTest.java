package qiqi.love.you;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by iscod on 2016/5/6.
 */
public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(5d, mCalculator.sum(1d, 4d), 0);
    }
}