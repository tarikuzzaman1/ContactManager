package com.anushka.androidtutz.contactmanager.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.anushka.androidtutz.contactmanager.db.entity.Contact;

import java.util.List;

@Dao
public interface ContactDAO {

    @Insert
    public long addContact(Contact contact);

    @Update
    public void updateContact(Contact contact);

    @Delete
    public void deleteContact(Contact contact);

    @Query("SELECT * FROM contacts")
    public List<Contact> getContacts();

    @Query("SELECT * FROM contacts WHERE contact_id == :contactId")
    public Contact getContact(long contactId);
}
