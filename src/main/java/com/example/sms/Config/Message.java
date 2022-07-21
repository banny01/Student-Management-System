package com.example.sms.Config;

public class Message {
    private String type;
    private String message;

    public Message() {
        this.type = "";
        this.message = "";
    }
    public Message(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
