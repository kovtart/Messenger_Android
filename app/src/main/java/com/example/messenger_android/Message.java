package com.example.messenger_android;

import java.util.Date;

class Message {
    private final String message;
    private final int type;
    private final Date sentAt;

    Message(String message, int type, Date sentAt) {
        this.message = message;
        this.type = type;
        this.sentAt = sentAt;
    }

    boolean isSent() {
        return type == 0;
    }

    Date getTime() {
        return sentAt;
    }

    String getMessage() {
        return message;
    }
}