package com.company.model;

public final class Order {

    private final int id;
    private final int customerId;
    private final int productId;
    private final int quantity;
    private final double price;
    private final String date;
    private final String status;

    public Order(int id, int customerId, int productId, int quantity, double price, String date, String status) {
        this.id = id;
        this.customerId = customerId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", date='" + date + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static Builder anOrder() {
        return new Builder();
    }


    private static final class Builder {
        private int id;
        private int customerId;
        private int productId;
        private int quantity;
        private double price;
        private String date;
        private String status;

        private Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder customerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder productId(int productId) {
            this.productId = productId;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Order build() {
            return new Order(id, customerId, productId, quantity, price, date, status);
        }
    }
}
