import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        System.out.println("Write something: ");
        String input = consoleInput();
        System.out.printf("Read from console : '%s'", input);
    }

    /**
     * Эта фуккция считывает одну строку с консоли.
     * @return строка из консоли
     */
    public static String consoleInput(){
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        scanner.close();
        return res;
    }

}
