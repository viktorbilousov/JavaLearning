import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        System.out.println("Write something: ");
        String input;
        input = consoleInput();
        System.out.println("Read from console : " + input);
    }

    /**
     * Эта фуккция считывает одну строку с консоли.
     * @return строка из консоли
     */
    public static String consoleInput(){
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
//        scanner.close();
        return res;
    }

    public static int consoleInputInt(){
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
//        scanner.close();
        return res;
    }

}
