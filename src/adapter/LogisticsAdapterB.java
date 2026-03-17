package org.example.adapter;

public class LogisticsAdapterB implements IInternalDeliveryService {

    private ExternalLogisticsServiceB service = new ExternalLogisticsServiceB();

    public void deliverOrder(String orderId) {
        service.sendPackage(orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return service.checkPackageStatus(orderId);
    }
}
