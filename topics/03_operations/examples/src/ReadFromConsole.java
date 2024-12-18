import java.util.Random;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
//        System.out.println("Write something: ");
//        String input;
//        input = consoleInput();
//        System.out.println("Read from console : " + input);

//        System.out.println(readNextNumber());

        System.out.println(generateRandomNumber(10, 100));

    }


    public static int generateRandomNumber(int min, int max) {
        if(min > max) {
            System.out.println("Ошибка min > max");
        }
        if(min == max) {
            return max;
        }
        return new Random().nextInt(max-min) + min;
    }

    public static int readNextNumber(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            if(!scanner.hasNextInt()){
                System.out.println("Please enter an integer");
                scanner = new Scanner(System.in);
            }
            else {
                return scanner.nextInt();
            }
        }
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
