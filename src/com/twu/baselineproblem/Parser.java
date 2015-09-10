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
}
