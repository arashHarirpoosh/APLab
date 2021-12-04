package Session8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;


public class ServerHandler implements Runnable{
    private DataInputStream rsv_msg;
    private DataOutputStream send_msg;
    private Socket client;

    ServerHandler(Socket client) {
        this.client = client;
        try {
            this.rsv_msg = new DataInputStream(
                    new BufferedInputStream(client.getInputStream())
            );
            this.send_msg = new DataOutputStream(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        String msg;
        StringBuilder out_msg = new StringBuilder();
        try {

            while (true) {
                msg = this.rsv_msg.readUTF();
                if (msg.equals("over")) {
                    break;
                }
                out_msg.append(msg).append(" ");
                System.out.println(this.client.toString() + ": " + msg);

            }
            System.out.println("Server's response to client " + this.client.toString() + ":" + out_msg.toString());
            this.send_msg.writeUTF(out_msg.toString());
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
