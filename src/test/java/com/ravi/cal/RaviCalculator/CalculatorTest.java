package com.ravi.cal.Calculator;

import com.ravi.cal.RaviCalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator cal = new Calculator(2, 3);

    @Test
    public void sumTest() throws Exception {
        assertEquals(5, cal.addFucn(2, 3));
    }

    @Test
    public void differenceTest() throws Exception {
        assertEquals(1, cal.subFucn(2, 3));
    }

    @Test
    public void productTest() throws Exception {
        assertEquals(6, cal.mulFucn(2, 3));
    }
}
