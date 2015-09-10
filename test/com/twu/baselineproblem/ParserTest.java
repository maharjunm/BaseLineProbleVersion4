package com.twu.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldRuturnTheListWhenWePassString() {
        String input = "1 book at 12.49";
        Parser parser = new Parser(input);
        String[] result = input.split(" ");

        assertArrayEquals(result, parser.split());
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsNotImported() {
        String input = "1 book at 12.49";
        Parser parser = new Parser(input);
        double result[] = {12.49, 0.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

}
