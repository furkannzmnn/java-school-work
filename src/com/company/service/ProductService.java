package com.company.service;

import com.company.dto.ProductDto;
import com.company.dto.request.OrderRequest;
import com.company.dto.request.ProductRequest;
import com.company.model.Category;
import com.company.model.Order;
import com.company.model.Product;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ProductService {

    private Product product = null;
    private final CategoryService categoryService = new CategoryService();
    private final OrderService orderService = new OrderService();


    public final ProductDto getProduct() {
        if (product != null) {
            return ProductDto.builder()
                    .id(product.getId())
                    .name(product.getName())
                    .category(product.getCategory())
                    .price(product.getPrice())
                    .quantity(product.getQuantity())
                    .order(orderService.getOrder())
                    .build();
        }
        throw new NullPointerException("Product is null");
    }

    public final ProductDto addProductData(ProductRequest request) {
        Category category = categoryService.getCategory();

        String categoryNumber = String.join(",", category.getAttribute());

        Map<Integer, String> categoryList = new HashMap<>();

        IntStream.range(1, category.getAttribute().size() + 1)
                .forEach(
                        i -> categoryList.put(i, categoryNumber.split(",")[i - 1])
                );

        System.out.println("CATEGORY LIST");
        categoryList.forEach((key, value) -> System.out.println(key + " " + value));
        String categoryName = request.getCategory();


        if (! category.getAttribute().contains(categoryName)) {
            throw new IllegalArgumentException("Category is not exist");
        }

        product = Product.builder()
                .id(new Random().nextInt(100))
                .category(categoryName)
                .name(request.getName())
                .price(request.getPrice())
                .quantity(request.getQuantity())
                .build();

        startOrder(product, request.getCustomer().getId());

        return getProduct();
    }

    public void startOrder(Product product, int customerId) {
        OrderRequest orderRequest = new OrderRequest(
                customerId,
                product.getId(),
                product.getQuantity(),
                product.getPrice(),
                LocalDateTime.now().toString(),
                "ORDER SUCCESS"
        );
        Function<OrderRequest, Integer> order  = orderService.addOrder(orderRequest);
        order.apply(orderRequest);
    }

}
