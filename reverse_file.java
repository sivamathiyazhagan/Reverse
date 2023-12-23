package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFileContent {
    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFile = "C:\\Users\\Siva KLR\\Desktop\\file.txt";
        String outputFile = "C:\\Users\\Siva KLR\\Desktop\\name.txt";
        String reversedContent = reverseFileContent(inputFile);
        writeToFile(outputFile, reversedContent);

        System.out.println("Content reversed and stored in " + outputFile);
    }

    private static String reverseFileContent(String filePath) {
        StringBuilder reversedContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                reversedContent.append(new StringBuilder(line).reverse()).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reversedContent.toString();
    }

    private static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


