

public class FunctionsExample {


    public static void main(String[] args) {
        int sum = sum(100,235);
        double sum1 = sum(100.1,235.2);
        int test = 2;

        printMyName("Viktor");

        int result;
        result =  sum(1,3);
        // result =  4;

        System.out.println("this is test variable in main: " + test);
        System.out.println(test);;
        System.out.println(sum);
    }



    // [public static] [тип данных, которая возвращает функция] [имя функции] ([аргументы функции])

    public static int sum (int x , int y){
        System.out.println("hello, im function sum!");
        return x + y;
    }

    public static double sum (double x , double y){
        System.out.println("hello, im function sum!");
        return x + y;
    }

    public static void printMyName(String name ){
        int test = 100;
        System.out.println("this is test variable in function: " + test);
        System.out.println("My name is " + name);
    }



}
