package org.contact.phone;

import java.util.*;
import java.util.Scanner;

public class Contacts {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> contactsList = new HashMap<String, String>();

    public void contactsFunc() {
        contactsList.put("John", "+12345");
        contactsList.put("Ann", "+132423");
        contactsList.put("Jane", "+12345");
        contactsList.put("Mike", "+132423");
    }

    public void showAllContacts() {
        for (String key : contactsList.keySet()) {
            System.out.println(key);
        }
    }

    public void addNewContact() {
        System.out.println("Please enter the contacts name:");
        String name = scanner.next();
        if (contactsList.containsKey(name)) {
            boolean finish = false;
            while (!finish) {
                System.out.println("\tDo you wish to update the contact?" +
                        "\n\t1. Yes" +
                        "\n\t2. No");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Please enter the contacts number:");
                    String number = scanner.next();
                    contactsList.put(name, number);
                    finish = true;
                } else if (answer == 2) {
                    finish = true;
                }
            }

        } else {
            System.out.println("Please enter the contacts number:");
            String number = scanner.next();
            contactsList.put(name, number);
        }
    }

    public void searchContact() {
        System.out.println("Please enter the contacts name:");
        String name = scanner.next();
        if (contactsList.containsKey(name)) {
            System.out.println("Name: " + name + "; Number: " + contactsList.get(name));
        } else {
            System.out.println("There is no contact with the name " + name);
        }
    }

    public void deleteContact() {
        System.out.println("Please enter contact name to remove");
        String name = scanner.next();
        if (contactsList.containsKey(name)) {
            contactsList.remove(name);
            System.out.println(name + " has been deleted.");
        } else {
            System.out.println("There is no contact with the name " + name);
        }
    }
}
