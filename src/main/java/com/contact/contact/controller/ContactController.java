package com.contact.contact.controller;

import com.contact.contact.domain.Contact;
import com.contact.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/contacts")
    public ResponseEntity<?> addContact(@RequestBody Contact contact){
        contactService.add(contact);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }

    @DeleteMapping("/contacts/{id}")
    public ResponseEntity<?> deleteContact(@PathVariable long id){
        contactService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @GetMapping("/contacts")
//    public ResponseEntity<?>
}
