package com.example.opilane.chatapp;

import java.util.Date;



public class ChatMessage {

    private String messageText; //sõnumi tekstis
    private String messageUser; //sõnumi saajaks
    private long messageTime; //sõnumi ajaks

    public ChatMessage(String messageText, String messageUser) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        messageTime = new Date().getTime();
    }
    // tühi kontrukter
    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
