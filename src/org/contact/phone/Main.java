package org.contact.phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello " + scanner.next());

        Contacts contacts = new Contacts();
        contacts.contactsFunc();

        Messages messages = new Messages();
        messages.messageFunc();

        boolean finish = false;
        while (!finish) {
            System.out.println("\t1. Manage contacts" +
                    "\n\t2. Messages" +
                    "\n\t3. Quit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    boolean finishContacts = false;
                    while (!finishContacts) {
                        System.out.println("\t1. Show all contacts" +
                                "\n\t2. Add a new contact" +
                                "\n\t3. Search for a contact" +
                                "\n\t4. Delete a contact" +
                                "\n\t5. Go back to the previous page");
                        int choiceManage = scanner.nextInt();
                        switch (choiceManage) {
                            case 1:
                                contacts.showAllContacts();
                                break;
                            case 2:
                                contacts.addNewContact();
                                break;
                            case 3:
                                contacts.searchContact();
                                break;
                            case 4:
                                contacts.deleteContact();
                                break;
                            case 5:
                                finishContacts = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean finishMessages = false;
                    while (!finishMessages) {
                        System.out.println("\t1. See the list of all messages" +
                                "\n\t2. Send a new message" +
                                "\n\t3. Go back to the previous page");
                        int choiceMessage = scanner.nextInt();
                        switch (choiceMessage) {
                            case 1:
                                messages.showAllMessages();
                                break;
                            case 2:
                                messages.sendNewMessage();
                                break;
                            case 3:
                                finishMessages = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    finish = true;
                    break;
            }
        }
    }
}