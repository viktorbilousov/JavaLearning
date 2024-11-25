

public class FunctionsExample {


    public static void main(String[] args) {
//       /*  int sum = sum(100,235);
//        double sum1 = sum(100.1,235.2);
//        int test = 2;
//
//        printMyName("Viktor");
//
//        int result;
//        result =  sum(1,3);
//        // result =  4;
//
//        System.out.println("this is test variable in main: " + test);
//        System.out.println(test);;
//        System.out.println(sum);
//*/
//        int number1 = -123456;
//        int number2 = -1227852;
//        boolean num1IsEven = isEvenNumber(number1);
//        boolean num2IsEven = isEvenNumber(number2);
//        System.out.println("num1: " + num1IsEven);
//        System.out.println("num2: " + num2IsEven);
//
//        // 123 -> 1*10^2 + 2*10^1 + 3 * 10^0
//        // 101 = 5 -> 1*2^2 + 0*2^1 + 1*2^0  = 4 + 0 + 1 = 5
//        // num = 1234 ( 1 тысяча, 2 сотни, 3 десятка , 4 единицы)
//        // decades(num) -> 3
//        int decNum1 = decades (number1);
//        int decNum2 = decades (number2);
//        System.out.println("num1 dec: " + decNum1);
//        System.out.println("num2 dec: " + decNum2);
//

    }


    public static boolean isEvenNumber (int y){
        if ( y % 2 == 1 ) {
            System.out.println("y = false");
            return false;
        }
        else {
            System.out.println("y = true");
            return true;
        }
    }

    public static int decades (int z) {
            int x;
            x = ((z % 100)-(z % 10))/10;
            return x;
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
