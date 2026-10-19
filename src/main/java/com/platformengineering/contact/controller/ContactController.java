package com.platformengineering.contact.controller;

import com.platformengineering.contact.model.Contact;
import com.platformengineering.contact.service.ContactService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping
    public Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }
}
