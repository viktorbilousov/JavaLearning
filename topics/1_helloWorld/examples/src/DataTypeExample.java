
public class DataTypeExample {
    public static void main(String[] args) {
        int a = 10;

        byte b = 100;
        short s = 30000;
        int a = 2000000;
        long l = 9000000000000000000L;


        
        double b = 10d;
        double c = 10.0;
        char symb = '1'; // обрати внимание на ковычки !
        String s = "some string";
        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3);  // 3.3333333333333335
        System.out.println(10d / 3); // 3.3333333333333335
        System.out.println(0 / 3); // 0
        System.out.println(3 / 0); //ArithmeticException ! == ошибка

    }
}
