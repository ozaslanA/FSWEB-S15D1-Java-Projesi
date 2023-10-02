package com.workintech.contact;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }
    public boolean addNewContact(Contact contact) {

        if (!myContacts.contains(contact)) {
            myContacts.add(contact);
            return true;
        }
        return false;
}
    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            //oldContact = newContact;
            oldContact.setName(newContact.getName());
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }
        return false;
    }
    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }
    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    public Contact queryContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }
    public void printContact(){
        for(int i=0; i < myContacts.size(); i++){
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}