package ru.siksmfp.player;

public class Main {
    public static void main(String[] args) {
        Player initiator = new Player();
        Player consumer = new Player();

        MessageBus bus = MessageBus.builder()
                .initiator(initiator)
                .consumer(consumer)
                .build();

        initiator.registerBus(bus);
        consumer.registerBus(bus);

        for (int i = 0; i < 100; i++) {
            initiator.sent("Message " + i);
        }
    }
}

//    export JAVA_HOME = '/Library/Java/JavaVirtualMachines/jdk1.8.0_202.jdk/Contents/Home'-- >
//    export JAVA_HOME='/Library/Java/JavaVirtualMachines/openjdk-11.0.2.jdk/Contents/Home'
