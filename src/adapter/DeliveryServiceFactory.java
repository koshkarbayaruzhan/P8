package org.example.adapter;

public class DeliveryServiceFactory {

    public static IInternalDeliveryService getService(String type) {

        switch (type) {
            case "internal":
                return new InternalDeliveryService();
            case "A":
                return new LogisticsAdapterA();
            case "B":
                return new LogisticsAdapterB();
            default:
                throw new IllegalArgumentException("Unknown service");
        }
    }
}
