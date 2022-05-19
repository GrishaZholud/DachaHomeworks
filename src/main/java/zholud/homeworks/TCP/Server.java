package zholud.homeworks.TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            ServerSocket socket = new ServerSocket(50001);
            Socket clientSocket = socket.accept();
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            while (!socket.isClosed()) {
                String entry = dataInputStream.readUTF();
                if (entry.equals("quit")) {
                    break;
                }
                System.out.println("client: " + entry);
                dataOutputStream.writeUTF(scanner.nextLine());
            }
            dataInputStream.close();
            dataOutputStream.close();
            clientSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

