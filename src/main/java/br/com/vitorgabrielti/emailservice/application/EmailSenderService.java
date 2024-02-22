package br.com.vitorgabrielti.emailservice.application;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.vitorgabrielti.emailservice.adapters.EmailSenderGateway;
import br.com.vitorgabrielti.emailservice.core.EmailSenderUserCase;

public class EmailSenderService implements EmailSenderUserCase{

    private final EmailSenderGateway emailSenderGateway;

    @Autowired
    public EmailSenderService(EmailSenderGateway emailGateway){
        this.emailSenderGateway = emailGateway;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.emailSenderGateway.sendEmail(to, subject, body);
    }
    
}
