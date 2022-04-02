package com.company.model;

public final class Product {

    private final int id;
    private final String name;
    private final double price;
    private final int quantity;
    private final String category;

    public Product(int id, String name, double price, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = 0;
        this.quantity = 0;
        this.category = null;
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


    public double getTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", name, price, quantity);
    }

    public String getCategory() {
        return category;
    }

    public static Builder builder() {
        return new Builder();
    }

    public final static class Builder {

        private int id;
        private String name;
        private double price;
        private int quantity;
        private String category;

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

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Product build() {
            return new Product(id, name, price, quantity, category);
        }
    }
}
