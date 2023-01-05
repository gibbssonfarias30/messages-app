package com.backfc17.messagesApp.model;

import java.time.LocalDate;

public class Messages {

    private int id;
    private String message;
    private String authorMessage;
    private LocalDate dateMessage;

    public Messages() {
    }

    public Messages(int id, String message, String authorMessage, LocalDate dateMessage) {
        this.id = id;
        this.message = message;
        this.authorMessage = authorMessage;
        this.dateMessage = dateMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public LocalDate getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(LocalDate dateMessage) {
        this.dateMessage = dateMessage;
    }

    @Override
    public String toString() {
        return "Messages{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", authorMessage='" + authorMessage + '\'' +
                ", dateMessage='" + dateMessage + '\'' +
                '}';
    }

}
