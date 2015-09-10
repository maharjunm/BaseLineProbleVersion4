//Calculate the tax based on item rate and TaxPercent
package com.twu.baselineproblem;

public class TaxCalculator {

    private double taxPercent;
    private double itemRate;

    public TaxCalculator(double itemRate, double taxPercent) {
        this.itemRate = itemRate;
        this.taxPercent = taxPercent;
    }

    public double calculateTax() {
        return (itemRate * taxPercent) / 100;
    }
}
