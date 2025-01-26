package com.vib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static Person createRandomPerson(){
        int age =  Math.abs(new Random().nextInt(99)) + 1;
        Person person = new Person("Viktor", age );
        return person;
    }


    public static void main(String[] args) {

       Student student1 = new Student("Viktor",30);
       Student student2 = new Student("Marina",18);

        System.out.println(student1);
        student1.toString();

       Student[] students = new Student[2];

       students[0] = student1;
       students[1] = student2;


       Student[] studentsArr = new Student[] {student1, student2};

       int num1 = 1;
       int num2 = 2;
       int[] nums = new int[]{num1, num2, 3};

       List<Student> list = new ArrayList<>();
       list.add(student1);

       Object o = "";


       System.out.println(studentsArr);

       Point a = new Point(1,1);
       Point b = new Point(2,2);
       Line line1 = new Line(a , b);
       Line line2 = new Line(a , b);




//        person.setName("Viktor");
//        person.setAge(-2);

//        System.out.println(person);
//
//        Point p = new Point(1,2);


//        Random random = new Random();
//
//        Integer i = 1;
//
//
//        Object light1 = new Light();
//        Light light2 = new Light("XL1", "Sony", "whith", 2.0 , false);
//
//        System.out.println(light2);
//
//        System.out.println(light2.equals(light1));
//
////
////        System.out.println(light2);
//
//        // instance
//
////        light.switchOff();
////        light.switchOn();
////
////        light.name;
////        light.color;


    }
}
