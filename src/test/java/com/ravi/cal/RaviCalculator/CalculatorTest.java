package com.ravi.cal.Calculator;

import com.ravi.cal.RaviCalculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
	
	Calculator cal = new Calculator(2, 3);
	
    @Test
    public void twoAndThreeIsFive() throws Exception {
    	assertEquals(cal.addFucn(2, 3),5);
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        assertEquals(cal.subFucn(2, 3),1);
    }
    
    @Test
    public void threeXThreeIsNine() throws Exception {
        assertEquals(cal.mulFucn(3, 3), 9);
    }
   
}
