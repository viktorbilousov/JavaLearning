import java.util.Scanner;

public class CashMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма: ");

        double a =scanner.nextInt();

        if (a / 1000 == 0){
            System.out.print(" ");
        }else if (a / 1000 == 1) {
            System.out.print("одна ");
        }else if (a / 1000 == 2) {
            System.out.print("две тысячи ");
        }else if (a / 1000 == 3) {
            System.out.print("три тысячи ");
        }else if (a / 1000 == 4) {
            System.out.print("четыре тысячи ");
        }else if (a / 1000 == 5) {
            System.out.print("пять тысяч ");
        }else if (a / 1000 == 6) {
            System.out.print("шесть тысяч ");
        }else if (a / 1000 == 7) {
            System.out.print("семь тысяч ");
        }else if (a / 1000 == 8) {
            System.out.print("восемь тысяч ");
        }else if (a / 1000 == 9) {
            System.out.print("девять тысяч ");
        }

        /*
        if ((a / 1000 >= 2) && (a / 1000 <= 5)){
            System.out.print("тысячи ");
        }else if ((a / 1000 >= 5) && (a / 1000 <= 9)){
            System.out.print("тысяч ");
         */

        if (a / 100 == 0){
            System.out.print(" ");
        }else if ((a % 1000)/100 == 10) {
            System.out.print("сто ");
        }else if ((a % 1000)/100 == 2) {
            System.out.print("двести ");
        }else if ((a % 1000)/100 == 3) {
            System.out.print("три ");
        }else if ((a % 1000)/100 == 4) {
            System.out.print("четыреста ");
        }else if ((a % 1000)/100 == 5) {
            System.out.print("пятьсот ");
        }else if ((a % 1000)/100 == 6) {
            System.out.print("шестьсот ");
        }else if ((a % 1000)/100 == 7) {
            System.out.print("семьсот ");
        }else if ((a % 1000)/100 == 8) {
            System.out.print("восемьсот ");
        }else if (( a % 1000)/100 == 9) {
            System.out.print("девятьсот ");
        }
        





    }
}
