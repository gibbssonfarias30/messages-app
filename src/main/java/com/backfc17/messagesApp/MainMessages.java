package com.backfc17.messagesApp;

import com.backfc17.messagesApp.service.MessageServiceImpl;

import java.util.Scanner;
public class MainMessages {
    public static void main(String[] args) {
        MessageServiceImpl messageService = new MessageServiceImpl();
        Scanner console = new Scanner(System.in);

        int option= 0;
        do {
            System.out.println("------------------------");
            System.out.println("Messaging App");
            System.out.println("1. Create message");
            System.out.println("2. List message");
            System.out.println("3. Edit message");
            System.out.println("4. Delete message");
            System.out.println("5. Exit application");
            System.out.println("-------------------------");

            option = console.nextInt();

            switch(option){
                case 1:
                    messageService.createMessage();
                    break;
                case 2:
                    messageService.listMessage();
                    break;
                case 3:
                    messageService.updateMessage();
                    break;
                case 4:
                    messageService.deleteMessage();
                    break;
                case 5:
                    break;
            }

        } while (option != 5);

    }
}
