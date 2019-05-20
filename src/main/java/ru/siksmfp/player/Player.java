package ru.siksmfp.player;

public class Player {
    private int messageSendCounter;
    private int messageReceivedCounter;

    private MessageBus messageBus;

    public Player(MessageBus messageBus) {
        this.messageBus = messageBus;
    }

    public Player() {

    }

    public void sent(String aaa) {
        messageBus.send();
    }

    public void consume() {
        String message = bus.consume();
        if (message != null) {

        }
    }
}
