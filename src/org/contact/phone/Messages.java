package org.contact.phone;

import java.util.HashMap;
import java.util.Scanner;

public class Messages {
    HashMap<String, String> messagesListFrom = new HashMap<String, String>();
    HashMap<String, String> messagesListTo = new HashMap<String, String>();
    Scanner scanner = new Scanner(System.in);

    public void messageFunc() {
        messagesListFrom.put("John", "Hello John. What is going on?");
        messagesListFrom.put("Ann", "Hello Ann. What is going on?");
        messagesListFrom.put("Mick", "Hello Mick. What is going on?");
    }

    public void showAllMessages() {
        for (String msg : messagesListFrom.keySet()) {
            System.out.println("From " + msg + ". Text: " + messagesListFrom.get(msg));
        }
    }

    public void sendNewMessage() {
        System.out.println("Enter receiver name:");
        String name = scanner.next();
        System.out.println("Enter receiver message: ");
        String message = scanner.next();
        messagesListTo.put(name, message);
    }
}
