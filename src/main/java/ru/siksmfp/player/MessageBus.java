package ru.siksmfp.player;

public class MessageBus {

    private Player initiator;
    private Player consumer;

    public static Builder builder() {
        return new MessageBus().new Builder();
    }

    public class Builder {
        public Builder initiator(Player initiator) {
            MessageBus.this.initiator = initiator;
            return this;
        }

        public Builder consumer(Player consumer) {
            MessageBus.this.consumer = consumer;
            return this;
        }

        public MessageBus build() {
            return MessageBus.this;
        }
    }
}
