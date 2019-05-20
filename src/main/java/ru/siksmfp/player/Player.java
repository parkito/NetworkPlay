package ru.siksmfp.player;

import java.util.Map;

public class Player {
    private Map<String, MessageCounter> messageCounterMap;

    private String Id;
    private MessageBus messageBus;

    public void sent(String text) {
        Message message = new Message();
//        messageBus.send(message);
//        messageSendCounter++;
    }

    public void consume(Message message) {
        System.out.println("Received: " + message);
        messageCounterMap.computeIfAbsent(message.getPlayerFrom(), k -> new MessageCounter())
                .incrementReceivedCounter();
    }

    public void registerBus(MessageBus bus) {
    }
}
