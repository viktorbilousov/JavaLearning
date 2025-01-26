package com.viktor;

import java.io.File;
import java.io.IOException;

public class ThrowableFunction {

    public static void readFile(String filePath) throws IOException, RuntimeException, Exception{
        File file = new File(filePath);
        if( ! file.exists()){
            throw new IOException("File not exists " + filePath);
        }
        System.out.println("File!");
    }

    public static void main(String[] args)  {
        String file = "C:\\Users\\Viktor\\Documents\\IdeaProjects\\learning\\JavaLearning\\topics\\09_try_catch\\examples\\src\\com\\viktor\\CatchException1.java";
        try {
            readFile(file);
        } catch (Exception e) {
            System.out.println("Error! " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Hello");
    }

}
