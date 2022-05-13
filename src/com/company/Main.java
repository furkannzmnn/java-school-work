package com.company;

import com.company.dto.CustomerType;
import com.company.dto.ProductDto;
import com.company.dto.request.ProductRequest;
import com.company.model.Customer;
import com.company.service.EmailSchedulerService;
import com.company.service.ProductService;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Customer customer = new Customer(
                "John",
                "Doe",
                "5345345345",
                "john@mail.com",
                "password",
                "123456789",
                new Random().nextInt(100),
                "");
        ProductService service = new ProductService();
        ProductRequest request = new ProductRequest(
                "hp pc", 12.22,1, "home", customer
        );
        ProductDto productDto = service.addProductData(request);

        String line  = String.join("\n", productDto.toString().split(","));

        System.out.println(line);


        EmailSchedulerService.start(productDto, CustomerType.INDIVIDUAL);
    }
}
