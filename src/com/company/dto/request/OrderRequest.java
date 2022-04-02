package com.company.dto.request;

public class OrderRequest {

    private final int customerId;
    private final int productId;
    private final int quantity;
    private final double price;
    private final String date;
    private final String status;

    public OrderRequest(int customerId, int productId, int quantity, double price, String date, String status) {
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status = status;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }
}
