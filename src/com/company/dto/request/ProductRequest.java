package com.company.dto.request;

import com.company.dto.CustomerType;
import com.company.model.Category;
import com.company.model.Customer;

public class ProductRequest {

    private String name;
    private double price;
    private int quantity;
    private String category;
    private Customer customer;
    private CustomerType type;

    public ProductRequest(String name, double price, int quantity, String category, Customer customer) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.customer = customer;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public CustomerType getCustomerType() {
        return type;
    }
}
