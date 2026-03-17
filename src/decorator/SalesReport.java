package org.example.decorator;

public class SalesReport implements IReport {

    public String generate() {
        return "Sales Report: [100$, 200$, 300$]";
    }
}
