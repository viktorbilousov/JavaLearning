package com.viktor;

import java.io.IOException;

public class FinalyExample {

    public static void writeNumberInFile() throws IOException {
        // logic
        throw new IOException();
    }

    public static void main(String[] args) {

        try {
            writeNumberInFile();
        }
        catch (IOException e) {
            System.out.println("Cannot write in file");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("Close Write Stream");
        }

        ///
        System.out.println(".....");

    }
}
