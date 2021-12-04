package Session8;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String msg;
        try {
            Socket socket = new Socket("localhost", 5000);
            DataOutputStream send_msg = new DataOutputStream(socket.getOutputStream());
            DataInputStream rsv_msg = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream())
            );
            while (true) {
                System.out.println("Please Enter the text:");
                msg = input.nextLine();
                send_msg.writeUTF(msg);
                if (msg.equals("over")) {
                    break;
                }
            }
            System.out.println("Server's response: ");
            System.out.println(rsv_msg.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
