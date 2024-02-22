package br.com.vitorgabrielti.emailservice.core;

public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
