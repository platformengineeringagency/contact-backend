package com.platformengineering.contact.service;

import com.platformengineering.contact.model.Contact;
import com.platformengineering.contact.repository.ContactRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepository contactRepo;

    public ContactService(ContactRepository contactRepo) {
        this.contactRepo = contactRepo;
    }

    public Contact save(Contact contact) {
        return contactRepo.save(contact);
    }
}
