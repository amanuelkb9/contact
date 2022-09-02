package com.contact.contact.integration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    public void send(){
        System.out.println("Email sending ...");
    }
}