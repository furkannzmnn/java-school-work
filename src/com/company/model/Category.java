package com.company.model;

import java.util.TreeSet;

public final class Category {

    private final TreeSet<String> attribute;
    private final String description;

    public Category(TreeSet<String> attribute, String description) {
        this.description = description;
        this.attribute = attribute;
 }

    public TreeSet<String> getAttribute() {
        return attribute;
    }

    public String getDescription() {
        return description;
    }
}
