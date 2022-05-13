package com.company.service;

public class OrderNumberHashUtil {

    public static String getHash(String orderNumber) {
        return orderNumber.substring(0, 3) + "-" + orderNumber.substring(3, 6) + "-" + orderNumber.substring(6, 9);
    }
}
