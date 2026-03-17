package org.example.decorator;

public class DateFilterDecorator extends ReportDecorator {

    public DateFilterDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return super.generate() + " | Filtered by date";
    }
}
