package com.backfc17.messagesApp.service;

import com.backfc17.messagesApp.dao.MessagesDAOImpl;
import com.backfc17.messagesApp.model.Messages;

import java.time.LocalDate;
import java.util.Scanner;

public class MessageServiceImpl implements IMessageService{
    MessagesDAOImpl messagesDAO = new MessagesDAOImpl();
    @Override
    public void createMessage() {
        Scanner console = new Scanner(System.in);
        System.out.println("Write your message: ");
        String message = console.nextLine();

        System.out.println("Name: ");
        String name = console.nextLine();

        Messages register = new Messages();
        register.setMessage(message);
        register.setAuthorMessage(name);
        register.setDateMessage(LocalDate.now());
        messagesDAO.createMessage(register);
    }

    @Override
    public void listMessage() {
        messagesDAO.readMessages();
    }

    @Override
    public void deleteMessage() {
        Scanner console = new Scanner(System.in);
        System.out.println("Indicates the ID of the message to delete: ");
        int id = console.nextInt();
        messagesDAO.deleteMessage(id);
    }

    @Override
    public void updateMessage() {
        Scanner console = new Scanner(System.in);
        System.out.println("Write your new message: ");
        String message = console.nextLine();

        System.out.println("Indicates the ID of the message to modify: ");
        int id = console.nextInt();

        Messages updateMessage = new Messages();
        updateMessage.setId(id);
        updateMessage.setMessage(message);
        messagesDAO.updateMessage(updateMessage);
    }
}
