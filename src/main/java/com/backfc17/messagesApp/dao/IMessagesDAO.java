package com.backfc17.messagesApp.dao;

import com.backfc17.messagesApp.model.Messages;

public interface IMessagesDAO {

    void createMessage(Messages message);
    void readMessages();
    void deleteMessage(int id);
    void updateMessage(Messages message);

}
