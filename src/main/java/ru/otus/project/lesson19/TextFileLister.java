package ru.otus.project.lesson19;

import java.io.*;
import java.util.Scanner;

public class TextFileLister {

    private static void readFile(File file) {
        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("File contents of " + file.getName());
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }

    private static void appendToFile(File file, String text) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(System.lineSeparator() + text);
            System.out.println("Text  appended to file.");
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("Updated file contents of " + file.getName() + ":");
        readFile(file);
    }

    public static void main(String[] args) {
        String rootDirectory = System.getProperty("user.dir");
        File rootDir = new File(rootDirectory);

        if (rootDir.isDirectory()) {
            FilenameFilter textFileFilter = new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            };

            String[] textFiles = rootDir.list(textFileFilter);
            if (textFiles != null && textFiles.length > 0) {
                System.out.println("List of files: ");
                for (String fileName : textFiles) {
                    System.out.println(fileName);
                }

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the file you are going to work with: ");
                String selectedFileName = scanner.nextLine();
                File selectedFile = new File(rootDir, selectedFileName);

                if (selectedFile.exists() && selectedFile.isFile()) {
                    System.out.println("File found: " + selectedFile.getName());
                    System.out.print("Enter text to append to the file: ");
                    String textToAdd = scanner.nextLine();
                    appendToFile(selectedFile, textToAdd);
                } else {
                    System.out.println("File not found: " + selectedFileName);
                }
            } else {
                System.out.println("No text files found in the project root directory.");
            }
        } else {
            System.out.println("Project root directory not found or is not a directory.");
        }
    }
}