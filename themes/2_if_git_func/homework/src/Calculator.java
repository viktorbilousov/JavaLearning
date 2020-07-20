import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Num: ");
        double a = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter Operation : ");
        String line = scanner.nextLine();

        System.out.print("Enter Second Num: ");
        double b = scanner.nextDouble();

        char c = line.charAt(0);

        if (b == 0 && c == '/') {
            System.out.println(" пожалуйста, повторите правила деления :3 ");
        } else if (c == '+') {
            System.out.println(" сложение ");
            double res = sum(a, b);
            System.out.println(a + " + " + b + " = " + res);
        } else if (c == '-') { //  если
            System.out.println(" вычитание ");
            double res = sub(a, b);
            System.out.println(a + " - " + b + " = " + res);
        } else if (c == '*') {
            System.out.println(" умножение ");
            double res = mul(a, b);
            System.out.println(a + " * " + b + " = " + res);
        } else if (c == '/') {
            System.out.println(" деление ");
            double res = div(a, b);
            System.out.println(a + " / " + b + " = " + res);
        } else if (c == '%') {
            System.out.println(" остаток от деления ");
            double res = rod(a, b);
            System.out.println(a + " % " + b + " = " + res);
        }
        else {
            System.out.println("Неизвестный символ");
        }

    }
    public static double sum (double a, double b) {
        return a + b;
    }
    public static double sub (double a, double b) {
        return a - b;
    }
    public static double mul (double a, double b) {
        return a * b;
    }
    public static double div (double a, double b) {
        return a / b;
    }
    public static double rod (double a, double b) {
        return a % b;
    }


    public static void run(){
        main(null);
    }

        /*System.out.println(a);
        System.out.println(c);
        System.out.println(b);*/

}