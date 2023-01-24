package com.example.emailService.Request;

public interface CreateEmailRequest {
    void sendEmail(String address, String subject, String message);
}
