package com.workintech.contact;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("05455195400");
        Contact Daniel = new Contact("Daniel", "05548576981");
        phone.addNewContact(new Contact("Emily", "05336862584"));
        phone.addNewContact(Daniel);
        phone.addNewContact(new Contact("Andrew", "05326854449"));
        phone.addNewContact(new Contact("Bernard", "05326854450"));
        phone.addNewContact(new Contact("Andrew", "05326854451"));
        phone.addNewContact(new Contact("Charlie", "05326854450"));
        phone.printContact();

        System.out.println("Index: " + phone.findContact(Daniel));


        System.out.println("Query Contact: " + phone.queryContact("Emily"));
        phone.removeContact(Daniel);
        phone.printContact();
    }
}