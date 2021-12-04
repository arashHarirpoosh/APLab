package Session8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever_single_thread {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(5000);
            String msg;
            StringBuilder out_msg = new StringBuilder();
            while (true) {
                Socket client = server.accept();
                DataInputStream rsv_msg = new DataInputStream(
                        new BufferedInputStream(client.getInputStream())
                );
                DataOutputStream send_msg = new DataOutputStream(client.getOutputStream());

                msg = rsv_msg.readUTF();
                while (true) {
                    out_msg.append(msg).append(" ");
                    System.out.println(msg);
                    msg = rsv_msg.readUTF();
                    if (msg.equals("over")) {
                        break;
                    }
                }
                System.out.println("Server response: " + out_msg.toString());
                send_msg.writeUTF(out_msg.toString());
                client.close();

                out_msg = new StringBuilder();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
