package org.example;

public class Order {
    public int id;
    public String customerName;
    public double price;
    public int quantity;
    public boolean isLoyal;

    public Order(int id, String customerName, double price, int quantity, boolean isLoyal) {
        this.id = id;
        this.customerName = customerName;
        this.price = price;
        this.quantity = quantity;
        this.isLoyal = isLoyal;
    }
}

