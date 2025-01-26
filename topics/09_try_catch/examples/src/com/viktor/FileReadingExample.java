package com.viktor;

import java.io.*;

public class FileReadingExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не найден: " + filePath);
        }
        catch (IOException e)
        {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии файла: " + e.getMessage());
            }
        }
    }
}