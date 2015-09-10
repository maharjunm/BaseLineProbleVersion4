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
        resultArray[0] = Double.parseDouble(list[list.length-1]);
        resultArray[1] = 0.0;
        return resultArray;
    }
}
