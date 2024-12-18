import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num: ");

        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println(" NULL ");
        } else if (num == 1) {
            System.out.println(" I`m number always one! ");
        } else if (num == 2) {
            System.out.println(" I look like a horse! ");
        } else if (num == 3) {
            System.out.println(" God love me~ uwu ");
        } else if (num == 4) {
            System.out.println(" I`m two time two ");
        } else if (num == 5) {
            System.out.println(" Number of hours I sleep per day... ");
        } else if (num == 6) {
            System.out.println(" I`m just six, but I love sex ");
        } else if (num == 7) {
            System.out.println(" Lucky boy ");
        } else if (num == 8) {
            System.out.println(" O my gosh, this is infinity! ");
        } else if (num == 9) {
            System.out.println(" I`m an upside-down six ");
        }

        if(num % 2 == 1) {
            System.out.println(" Нечетное ");
        }else if ( num % 2 == 0) {
                System.out.println(" Четное ");
        }else if ( num % 3 == 0) {
            System.out.println(" Делится на 3 ");
        }

        if ( num > 5) {
            System.out.println(" Больше 5 ");
        }

        if ( num > 3 && num < 7 ) {
            System.out.println(" Между 3 и 7 ");
        }

        if ( num >= -9 && num <= 0 ) {
            System.out.println(num*-1 );

            //больше по модолю 10... как?"
        }
    }
}
