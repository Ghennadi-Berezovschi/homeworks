package ru.otus.project.lesson20;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientServer {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);

            DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            Scanner scanner = new Scanner(System.in);
            String availableOperations = in.readUTF();
            System.out.println(availableOperations);

            System.out.println("Enter a first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter a second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Enter an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            out.writeDouble(number1);
            out.writeDouble(number2);
            out.writeChar(operation);
            out.flush();

            String response = in.readUTF();
            System.out.println("Response: " + response);
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

