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
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsNotImportedAndBookItem() {
        String input = "1 book at 12.49";
        Parser parser = new Parser(input);
        double result[] = {12.49, 0.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsNotImported() {
        String input = "1 music CD at 14.99";
        Parser parser = new Parser(input);
        double result[] = {14.99, 10.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsNotImportedAndChocolates() {
        String input = "1 chocolate bar at 0.85";
        Parser parser = new Parser(input);
        double result[] = {0.85, 0.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsImportedAndChocolates() {
        String input = "1 imported box of chocolates at 10.00";
        Parser parser = new Parser(input);
        double result[] = {10.00, 5.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsImportedAndPerfume() {
        String input = "1 imported bottle of perfume at 47.50";
        Parser parser = new Parser(input);
        double result[] = {47.50, 15.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsNonImportedAndMedicalItem() {
        String input = "1 packet of headache pills at 9.75";
        Parser parser = new Parser(input);
        double result[] = {9.75, 0.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnTheItemRateAndTaxPercentWhenItemIsImportedAndChocolateItem() {
        String input = "1 box of imported chocolates at 11.25";
        Parser parser = new Parser(input);
        double result[] = {11.25, 5.0};

        assertArrayEquals(parser.parse(), result, 0.00);
    }

    @Test
    public void shouldRuturnProperOutputForNonImportedBookItems() {
        String input = "1 book at 12.49";
        Parser parser = new Parser(input);
        String result = "1 book: 12.49";

        assertEquals(parser.giveProperOutput(), result);
    }

    @Test
    public void shouldRuturnProperOutputForNonImportedMusicItems() {
        String input = "1 music CD at 14.99";
        Parser parser = new Parser(input);
        String result = "1 music CD: 16.49";

        assertEquals(parser.giveProperOutput(), result);
    }

    @Test
    public void shouldRuturnProperOutputForNonImportedChocolatesItems() {
        String input = "1 chocolate bar at 0.85";
        Parser parser = new Parser(input);
        String result = "1 chocolate bar: 0.85";

        assertEquals(parser.giveProperOutput(), result);
    }

    @Test
    public void shouldRuturnProperOutputForImportedChocolatesItems() {
        String input = "1 imported box of chocolates at 10.00";
        Parser parser = new Parser(input);
        String result = "1 imported box of chocolates: 10.50";

        assertEquals(parser.giveProperOutput(), result);
    }

    @Test
    public void shouldRuturnProperOutputForImportedPerfumeItems() {
        String input = "1 imported bottle of perfume at 47.50";
        Parser parser = new Parser(input);
        String result = "1 imported bottle of perfume: 54.65";

        assertEquals(parser.giveProperOutput(), result);
    }

}
