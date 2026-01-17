package com.store.main;

import com.store.order.OnlineOrder;
import com.store.order.Order;
import com.store.order.OrderStatus;

import java.util.ArrayList;
import java.util.Iterator;

public class OrderApp {
    public static void main(String[] args) {

        ArrayList<Order> orders = new ArrayList<>();

        // Adding 3 orders
        orders.add(new OnlineOrder(1, 100.0));
        orders.add(new OnlineOrder(2, 250.0));
        orders.add(new OnlineOrder(3, 50.0));

        // Process and pay first order
        OnlineOrder firstOrder = (OnlineOrder) orders.get(0);
        firstOrder.processOrder();
        firstOrder.pay();

        // Set one order to CANCELLED for testing removal
        OnlineOrder cancelledOrder = (OnlineOrder) orders.get(2);
        cancelledOrder.setStatus(OrderStatus.CANCELLED);

        // Traverse orders using Iterator
        System.out.println("\nOrder List:");
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getOrderSummary());

            // Remove CANCELLED orders
            if (order.getStatus() == OrderStatus.CANCELLED) {
                iterator.remove();
                System.out.println("Removed CANCELLED order ID: " + order.getOrderId());
            }
        }

        // Final order list
        System.out.println("\nFinal Orders:");
        for (Order order : orders) {
            System.out.println(order.getOrderSummary());
        }
    }
}
