package ru.siksmfp.player;

public class Message {
    private String playerFrom;
    private String playerTo;
    private String message;

    public static Message.Builder builder() {
        return new Message().new Builder();
    }

    public class Builder {
        public Message.Builder playerFrom(String playerFrom) {
            Message.this.playerFrom = playerFrom;
            return this;
        }

        public Message.Builder playerTo(String playerTo) {
            Message.this.playerTo = playerTo;
            return this;
        }

        public Message.Builder message(String message) {
            Message.this.message = message;
            return this;
        }

        public Message build() {
            return Message.this;
        }
    }

    public String getPlayerFrom() {
        return playerFrom;
    }

    public void setPlayerFrom(String playerFrom) {
        this.playerFrom = playerFrom;
    }

    public String getPlayerTo() {
        return playerTo;
    }

    public void setPlayerTo(String playerTo) {
        this.playerTo = playerTo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}