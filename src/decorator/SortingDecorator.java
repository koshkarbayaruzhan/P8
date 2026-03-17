package org.example.decorator;

public class SortingDecorator extends ReportDecorator {

    public SortingDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return super.generate() + " | Sorted data";
    }
}
