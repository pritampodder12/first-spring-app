package com.firstappjava17.first_spring_app_in_java_seventeen.service;

import java.util.List;

import com.firstappjava17.first_spring_app_in_java_seventeen.entity.Contact;

/**
 * ContactService
 */
public interface ContactService {
    List<Contact> getAllContacts();

    Contact getContactById(String id);

    void saveContact(Contact contact);

    void updateContact(String id, Contact contact);

    void deleteContact(String id);
}