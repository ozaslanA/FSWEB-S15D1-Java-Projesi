package com.workintech.contact;

import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return phoneNumber.equals(contact.phoneNumber);
}

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n--------------------\n");
        builder.append("Name: " + name + "\n");
        builder.append("Phone Number: " + phoneNumber + "\n");
        builder.append("--------------------\n");
        return builder.toString();
    }

}
