package com.vib;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        Integer i = 1;


        Object light1 = new Light();
        Light light2 = new Light("XL1", "Sony", "whith", 2.0 , false);

        System.out.println(light2);

        System.out.println(light2.equals(light1));

//
//        System.out.println(light2);

        // instance

//        light.switchOff();
//        light.switchOn();
//
//        light.name;
//        light.color;


    }
}
