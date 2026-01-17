package com.store.order;

import com.store.payment.Payable;

public class OnlineOrder extends Order implements Payable {

    public OnlineOrder(int orderId, double amount) {
        super(orderId, amount);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing Online Order ID: " + getOrderId());
    }

    @Override
    public void pay() {
        setStatus(OrderStatus.PAID);
        System.out.println("Order ID " + getOrderId() + " is now PAID.");
    }
}
