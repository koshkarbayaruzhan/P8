package org.example.adapter;

public class LogisticsAdapterA implements IInternalDeliveryService {

    private ExternalLogisticsServiceA service = new ExternalLogisticsServiceA();

    public void deliverOrder(String orderId) {
        service.shipItem(Integer.parseInt(orderId));
    }

    public String getDeliveryStatus(String orderId) {
        return service.trackShipment(Integer.parseInt(orderId));
    }
}
