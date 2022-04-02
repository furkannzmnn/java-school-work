package com.company.service;

import com.company.model.Category;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.CompletableFuture;

public class CategoryService {

    private Category category = null;

    public CategoryService() {}

    public CompletableFuture<Category> addCategoryStatic() {
        TreeSet<String> categories = new TreeSet<>();
        addData(categories);
        category = new Category(categories, "categories");
        return CompletableFuture.runAsync(() -> {}).thenApply(v -> category);
    }

    private void addData(TreeSet<String> categories) {
        categories.add("home");
        categories.add("garden");
        categories.add("kitchen");
        categories.add("bathroom");
        categories.add("bedroom");
    }

    public Category getCategory() {
        CompletableFuture<Category> future = addCategoryStatic();
        nodeCategories(future.join().getAttribute());
        return future.join();
    }

    private void nodeCategories(TreeSet<String> categories) {
        Iterator<String> descendingIterator = categories.descendingIterator();
        while (descendingIterator.hasNext() && category.getAttribute().size() < 5) {
            System.out.println(descendingIterator.next());
        }
    }

}
