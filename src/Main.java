package org.example;

import org.example.decorator.*;
import org.example.adapter.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("DECORATOR");

        IReport report = new SalesReport();
        report = new DateFilterDecorator(report);
        report = new SortingDecorator(report);
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());

        System.out.println("\nADAPTER");

        IInternalDeliveryService service =
                DeliveryServiceFactory.getService("A");

        service.deliverOrder("123");
        System.out.println(service.getDeliveryStatus("123"));
    }
}
