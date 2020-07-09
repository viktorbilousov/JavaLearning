import java.util.Scanner;

public class Pasta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //была ошибка с командой "scanner"//
        System.out.print("введите число:");
        double num = scanner.nextDouble();
        double z = num * 2;
        String inputLine = scanner.nextLine();
        System.out.println( num +" * 2 ="+ z);



    }
}