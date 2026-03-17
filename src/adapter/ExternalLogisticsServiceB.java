package org.example.adapter;

public class ExternalLogisticsServiceB {

    public void sendPackage(String info) {
        System.out.println("ServiceB sending package " + info);
    }

    public String checkPackageStatus(String code) {
        return "ServiceB: Delivered";
    }
}
