package com.company.service;

public class IndividualCustomer extends EmailTemplate{
    @Override
    public String getTemplate() {
        return "BİREYSEL KULLANICI";
    }

    @Override
    public String getType() {
        return "BİREYSEL";
    }

    @Override
    public String getSubject() {
        return "ÜRÜN SİPARİŞİ VERİLDİ ,TEŞEKKÜR EDERİZ";
    }
}
