//Parser will split the strings into list
package com.twu.baselineproblem;


public class Parser {

    private String item;

    public Parser(String item) {
        this.item = item;
    }

    public String[] split() {
        return item.split(" ");
    }

    public double[] parse() {
        String[] list = split();
        double[] resultArray = new double[2];
        resultArray[0] = Double.parseDouble(list[list.length - 1]);
        if (item.contains("imported")) {
            resultArray[1] = 5.0;
            if (list[1].equals("book") || item.contains("chocolates")) {
                resultArray[1] += 0.0;
            } else {
                resultArray[1] += 10.0;
            }
        } else {
            if (list[1].equals("book") || list[1].equals("chocolate") || list[list.length - 3].equals("pills"))
                resultArray[1] = 0.0;
            else
                resultArray[1] = 10.0;
        }
        return resultArray;
    }

    public String giveProperOutput() {
        String[] list = item.split(" at ");
        double[] valuesOfItem = parse();
        double itemRate = valuesOfItem[0];
        double taxPercent = valuesOfItem[1];
        TaxCalculator taxCalculator = new TaxCalculator(itemRate, taxPercent);
        double finalRateOfItem = taxCalculator.calculateTax() + itemRate;
        finalRateOfItem = finalRateOfItem * 100;
        finalRateOfItem = Math.round(finalRateOfItem);
        finalRateOfItem = finalRateOfItem / 100;
        String result = list[0] + ": " + finalRateOfItem;
        if (result.length() == item.length() - 1)
            return result;
        else
            return result + "0";
    }
}
