package com.contact.contact.service;

import com.contact.contact.domain.Contact;
import com.contact.contact.integration.EmailSender;
import com.contact.contact.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    ContactRepository contactRepository;
    @Autowired
    EmailSender emailSender;

    public void add(Contact contact){
        contactRepository.save(contact);
        emailSender.send();
    }

    public void delete(long id){

        Contact contact = contactRepository.findById(id).get();
        if(contact != null){
            contactRepository.delete(contact);
        }
    }
}
