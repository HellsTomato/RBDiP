package org.example.model;

public class Order {
    private final int id;
    private final String customerName;
    private final double price;
    private final int quantity;
    private final boolean isLoyal;

    public Order(int id, String customerName, double price, int quantity, boolean isLoyal) {
        this.id = id;
        this.customerName = customerName;
        this.price = price;
        this.quantity = quantity;
        this.isLoyal = isLoyal;
    }

    public int getId() { return id; }
    public String getCustomerName() { return customerName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public boolean isLoyal() { return isLoyal; }
}
