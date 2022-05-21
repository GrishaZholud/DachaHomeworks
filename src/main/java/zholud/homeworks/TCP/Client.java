package zholud.homeworks.TCP;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            Socket socket = new Socket("localhost", 50001);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            while (!socket.isClosed()) {
                dataOutputStream.writeUTF(scanner.nextLine());
                String entry = dataInputStream.readUTF();
                System.out.println("server: " + entry);
                if (entry.equals("quit")) {
                    break;
                }
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}