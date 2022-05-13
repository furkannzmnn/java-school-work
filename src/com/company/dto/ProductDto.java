package com.company.dto;

import com.company.model.Order;

public class ProductDto {

    private int id;
    private final String name;
    private final double price;
    private final int quantity;
    private final String category;
    private final Order order;

    public ProductDto(String name, double price, int quantity, String category, Order order, int id) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.order = order;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", order=" + order +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public Order getOrder() {
        return order;
    }

    public static final class Builder {
        private String name;
        private double price;
        private int quantity;
        private String category;
        private Order order;
        private int id;

        private Builder() {
        }


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public ProductDto build() {
            return new ProductDto(name, price, quantity, category, order, id);
        }
    }
}
