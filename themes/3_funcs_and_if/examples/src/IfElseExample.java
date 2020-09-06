import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {
        System.out.println("Enter a number :");
        ifExample3();

    }

    public static  void ifExample3(){
        int num = consoleInputInt();

        if( num  == 10 ){ //  если
            System.out.println("num == 10");
        }
        else if(num > 0){
            System.out.println("num  > 0");
        }
        else if( num == -10){
            System.out.println("num  = -10");
        }
        else if( num < 0){
            System.out.println("num  < 0");
        }
        else {
            System.out.println("num == 0");
        }

    }

    public static  void ifExample2(){
        int num = consoleInputInt();

        if( num  == 10 ){ //  если
            System.out.println("num == 10");
        }
        else { // во всех других слуаев
            System.out.println("num > 0, <0");
        }
    }


    public static  void ifExample1(){
        int num = consoleInputInt();

        if( num > 0 ){
            System.out.println("num > 0");
        }

        if(num < 0){
            System.out.println("num < 0");
        }

        if (num == 0){
            System.out.println("num = 0");
        }
    }

    public static int consoleInputInt(){
        Scanner scanner = new Scanner(System.in);
        int res = scanner.nextInt();
        scanner.close();
        return res;
    }

}
