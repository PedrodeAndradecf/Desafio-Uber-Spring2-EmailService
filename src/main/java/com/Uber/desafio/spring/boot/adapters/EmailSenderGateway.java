package com.Uber.desafio.spring.boot.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
