package com.Uber.desafio.spring.boot.application;

import com.Uber.desafio.spring.boot.adapters.EmailSenderGateway;
import com.Uber.desafio.spring.boot.core.EmailSenderUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmailSenderService implements EmailSenderUseCase {


    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }


    @Override
    public void sendEmail(String to, String subject, String body){
        this.emailSenderGateway.sendEmail(to, subject, body);

    }
}
