package org.example.adapter;

public interface IInternalDeliveryService {

    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
}
