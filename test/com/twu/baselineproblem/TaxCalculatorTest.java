package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxCalculatorTest {

    @Test
    public void shouldReturnTheValueAsZeroWhenTwoValuesAreZero() {
        TaxCalculator taxCalculator = new TaxCalculator(0,0);

        assertEquals(0.0, taxCalculator.calculateTax(), 0.00);
    }

    @Test
    public void shouldReturnTheValueAsZeroWhenFirstValueIsZero() {
        TaxCalculator taxCalculator = new TaxCalculator(0,1);

        assertEquals(0.0, taxCalculator.calculateTax(), 0.00);
    }

    @Test
    public void shouldReturnTheValueAsZeroWhenSecondValueIsZero() {
        TaxCalculator taxCalculator = new TaxCalculator(1,0);

        assertEquals(0.0, taxCalculator.calculateTax(), 0.00);
    }
}
