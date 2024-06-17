package ru.otus.project.lesson20;

import java.io.*;
import java.net.*;


public class CalcServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server started listening on port 9999");

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            try (DataInputStream in = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
                 DataOutputStream out = new DataOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()))) {

                double number1 = in.readDouble();
                double number2 = in.readDouble();
                char operation = in.readChar();

                double result = 0;
                boolean validOperation = true;

                switch (operation) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            out.writeUTF("/0 is invalid operation");
                            validOperation = false;
                        }
                        break;
                    default:
                        validOperation = false;
                        out.writeUTF("Invalid operation");
                        break;
                }

                if (validOperation) {
                    out.writeUTF("Result is: " + result);
                }

                out.flush();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}

