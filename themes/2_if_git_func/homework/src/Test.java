import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Первое число: ");
        int a = scanner.nextInt();

        if (a < 0 || a > 10 || a==0 ){
            System.exit(0);
        }

        scanner.nextLine();

        System.out.print("Второе число: ");
        int b = scanner.nextInt();

        if (b <= 0 || b > 10 || b==0 ){
            System.exit(0);
        }

        int c = (a * b);

        System.out.println(a + " * " + b + " = ???");

        System.out.println("Каков результат умножения первого числа на второе?");

        System.out.print(" ");
        int d = scanner.nextInt();

        if (c == d) {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (c != d) {
            System.out.println("НЕВЕРНО, " + a + " * " + b + " = " + (a * b) + "!");

        }


    }
}
