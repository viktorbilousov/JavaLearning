package com.viktor;

import java.util.Random;

public class CatchException {

    private static void makeError(){
        int cnt = 10000;
        Integer[] arr = new Integer[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] =  new Random().nextInt();
        }
        arr[cnt-1] = 0;

        Integer cons = Integer.MAX_VALUE;
        for (Integer i : arr) {
           double res=  cons/ i;
        }

    }

    public static void main(String[] args) {

        try {
            makeError();
        }
        catch (java.lang.Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Hello");
    }
}
