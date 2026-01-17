package com.store.order;

public abstract class Order {

    private int orderId;
    private double amount;
    private OrderStatus status;

    public Order(int orderId, double amount) {
        this.orderId = orderId;
        setAmount(amount);  // validation
        this.status = OrderStatus.PENDING;
    }

    // Abstract method for processing order
    public abstract void processOrder();

    // Concrete method
    public String getOrderSummary() {
        return "Order ID: " + orderId + ", Amount: $" + amount + ", Status: " + status;
    }

    // Getters
    public int getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    // Setter with validation
    public void setAmount(double amount) {
        if (amount >= 0) {
            this.amount = amount;
        } else {
            System.out.println("Invalid amount. Must be >= 0.");
        }
    }

    // Setter for status (used by subclasses)
    protected void setStatus(OrderStatus status) {
        this.status = status;
    }
}
