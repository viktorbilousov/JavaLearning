import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
       /* int[] res = differences(new int[] { 1,2,8,4,5});
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        } */
       int [] test  = new int[10];
        test[0]=100;
        test[2] =234;
        test[3]=12;
        printAll(test);
    }




    public static void example4Continue(){
        int[] arr = new int[100];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500);
        }

        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        // вывести все числа больше 100
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 100) continue;

            System.out.println(arr[i]);
        }

    }

    public static int[] differences(int[] arr){
        // 1 2 4 5 6 7 8 9
        // 2-1, 4-3, 5-4
        // (i+1 - i)

        //input  1 5 6 7
        //output   4 1 1
        int []res = new int[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) continue;
            res[i-1] = arr[i]- arr[i-1];
        }
        return res;

    }

    public static void example3(){
        int [] arr = new int[15]; // от 0 до 14
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i+1;
            // i = 0 : arr[0] = 1
            // i = 1 : arr[1] = 2
            // i = 2 : arr[2] = 3
            // ....
            // i : arr[i] = i+1
        }

        // arr.length = 10
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = (arr.length-1); i >= 0 ; i--) {
            System.out.println(arr[i]);
            // iteration 1: i=10 : arr[10]
            // iteration 2: i=9 : arr[9]
            // ...
            // iteration 10: i=0 : arr[0]

        }

    }
    public static void example2(){
        int [] arr = new int[1000];

        //arr[0] - first value in array
        //arr[999] - last value in array

        // 0 , 1, 2, 3, 4, ..., 999

        // arr.length == 1000



        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;

            // i=0 : arr[0] = 0
            // i=1 : arr[1] = 1
            // i=2 : arr[2] = 2
            // ...
            // i : arr[i] = i
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = calcSum(0, i);
        }

        for (int i = 0; i <= 100; i++) {
            System.out.println("i=" + i + " : " + arr[i]);
        }

    }

    public static int calcSum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum = sum + i;

        }
        return sum;
    }


    public static void example1(){
        int a = 1;
        int b = 2;

        // [тип данных][] [name of array] =  new [тип данных][cnt elements in array]
        String[] names = new String[16];
        int[] ages = new int[10];
        double[] weigth = new double[0];

        names[0] = "Vitya";
        names[1] = "Katya";
        names[2] = "Sergey";
        names[10] = "Masha";

        System.out.println(names);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[10]);


        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 31;
        arr1[2] = 10;
        arr1[2] = 11;
        //  arr1[3] = 10; // error arr1[3] -> 4 element

        int[] arr2 = new int[] {1 , 2 , 3 , 4 , 5 , 29183721};
        // arr2[0] = 1, arr1[1] = 2 ...

        System.out.println(arr2.length); // количество елементов в массиве

        printFirstAndLastElement(arr1); // не елемент, а целый масив как агрумент функции

        // int[] = [int, int , int , int]

        int a1 = 1 ;
        int b1[] = new int[1];
        b1[0] = 1;

        addOne(a1);
        addOneInArr(b1);

        System.out.println(a1); // 1
        System.out.println(b1[0]); // 2
    }
    public static void printAll(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void printFirstAndLastElement(int[] array){
        System.out.println("first = " + array[0]);
        System.out.println("last = " +array[ array.length-1 ]);
        // int a [3]
        // a.length = 3
        // a[2]

        // int b [5]
        // b.length = 5
        // b[4]
    }

    public static void addOneInArr(int[] array){
        array[0] += 1;
    }

    public static void addOne(int num){
        num += 1;
    }

}
