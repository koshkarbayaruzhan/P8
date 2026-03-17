package org.example.adapter;

public class InternalDeliveryService implements IInternalDeliveryService {

    public void deliverOrder(String orderId) {
        System.out.println("Internal delivery for order " + orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return "Internal: Delivered";
    }
}
