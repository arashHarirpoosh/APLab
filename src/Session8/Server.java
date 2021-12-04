package Session8;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            while (true) {
                Socket client = server.accept();
                Thread cl = new Thread(new ServerHandler(client), client.toString());
                cl.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
