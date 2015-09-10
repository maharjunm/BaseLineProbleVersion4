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
        if (list[1].equals("imported")) {
            resultArray[1] = 5.0;
            if (list[1].equals("book")) {
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
}
