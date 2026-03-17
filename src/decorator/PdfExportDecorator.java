package org.example.decorator;

public class PdfExportDecorator extends ReportDecorator {

    public PdfExportDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return "PDF: " + super.generate();
    }
}
