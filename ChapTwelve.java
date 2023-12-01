package edu.neu.mgen;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChapTwelve {

    public static void main(String[] args) {
        String fileName = "my_test_file.txt";

        String content = readFromFile(fileName);
        System.out.println(content);

        System.out.print("Enter phrase: ");
        String newPhrase = getUserInput();
        writeToFile(fileName, newPhrase);

        content = readFromFile(fileName);
        System.out.println(content);
    }

    private static void writeToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    private static String getUserInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
