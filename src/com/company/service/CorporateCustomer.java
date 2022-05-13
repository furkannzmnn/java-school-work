package com.company.service;

public class CorporateCustomer extends EmailTemplate{

    @Override
    public String getTemplate() {
        return "KURUMSAL KULLANICI";
    }

    @Override
    public String getType() {
        return "KURUMSAL";
    }

    @Override
    public String getSubject() {
        return "ÜRÜN SİPARİŞİ VERİLDİ";
    }
}
