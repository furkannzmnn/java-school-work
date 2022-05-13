package com.company.service;

public abstract class EmailTemplate {
    public void sendEmail(String email) {
        String template = getTemplate();
        String type = getType();
        String subject = getSubject();
        System.out.println("Sending email to " + email + " with template " + template + " and type " + type + " and subject " + subject);
    }

    public abstract String getTemplate();
    public abstract String getType();
    public abstract String getSubject();
}
