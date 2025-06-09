package com.Uber.desafio.spring.boot.core;

public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
