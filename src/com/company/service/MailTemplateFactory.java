package com.company.service;

import com.company.dto.CustomerType;

public class MailTemplateFactory {
    public static EmailTemplate getType(CustomerType type) {
        if (type == CustomerType.INDIVIDUAL) {
            return new IndividualCustomer();
        }else if (type == CustomerType.CORPORATE) {
            return new CorporateCustomer();
        }else {
            throw new IllegalArgumentException("Invalid type");
        }
    }
}
