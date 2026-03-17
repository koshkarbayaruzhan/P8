package org.example.decorator;

public class CsvExportDecorator extends ReportDecorator {

    public CsvExportDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return "CSV: " + super.generate();
    }
}
