package com.fss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testSum()
    {
        App app = new App();
        int expected = 10;
        int actual = app.sum(5,5);

        assertEquals(expected,actual);
        assertTrue(2<3);
        System.out.println("run");
    }
}
