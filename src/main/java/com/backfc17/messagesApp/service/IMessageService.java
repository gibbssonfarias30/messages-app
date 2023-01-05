package com.backfc17.messagesApp.service;

import com.backfc17.messagesApp.model.Messages;

public interface IMessageService {
    void createMessage();
    void listMessage();
    void deleteMessage();
    void updateMessage();
}
