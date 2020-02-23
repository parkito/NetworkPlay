package ru.siksmfp.network.play.champ.server.io;

import ru.siksmfp.network.play.champ.handler.impl.io.PooledHandler;
import ru.siksmfp.network.play.champ.handler.impl.io.PrintableHandler;
import ru.siksmfp.network.play.champ.handler.impl.io.TransmogrifyHandler;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.Executors;

public class PooledBlockingServer {

    public static void main(String[] args) throws IOException {
        PooledHandler<Socket> handler = new PooledHandler<>(
                new PrintableHandler<>(
                        new TransmogrifyHandler()
                ),
                Executors.newCachedThreadPool(),
                (t, e) -> System.out.println("Uncaught " + t + " error " + e)
        );

        ServerSocket ss = new ServerSocket(8081);
        while (true) {
            handler.handle(ss.accept());
        }
    }
}
