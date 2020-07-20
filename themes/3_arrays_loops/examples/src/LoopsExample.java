import java.util.Scanner;

public class LoopsExample {

    public static void main(String[] args) {
       //  1 -> 100
//       int i = 0;
//        System.out.println("start of loop");
//        while (i <= 10) {
//           System.out.println("i is " + i);
//           i++;
//       }
//        System.out.println("end of loop");
//        System.out.println("i is " + i);
//
//        int j = 20;
//        do{
//            System.out.println("i is " + j);
//            j++;
//        }while (j  <= 10);
//
        //printNumsFor(10);
//        while (true) {
//            Calculator.run();
//        }
       // printNumsForStep3(30);
      //  printSquare(-10, 10);
       // int sum = calcSum(0, 100);
       // System.out.println(sum);

       exampleContinue();
    }

    public static void exampleNoBreak(){
        int i = 0;
        // если i = -1 -> не выводить сообщение, а просто выйти из цикла
        while (i != -1){
            i = enterNum();
            if( i != -1 ) { // очень не удобная конструкция
                System.out.println("you number is : " + i);
            }
        }
        System.out.println("exit");
    }
    public static void exampleBreak(){
        // если i = -1 -> не выводить сообщение, а просто выйти из цикла
        while (true){
            int i = enterNum();
            if( i == -1 ) {
                break; // выйти из цикла
            }
            System.out.println("you number is : " + i);
        }
        System.out.println("exit");
    }

 // нерпвильное применение continue;
    public static void exampleContinue(){
        int i = 0;
        while (i != -1){
            i = enterNum();
            if( i == -1 ) {
                continue; // закончить ИТЕРАЦИЮ (проверить условие)
            }
            System.out.println("you number is : " + i);
        }
        System.out.println("exit");
    }
    // y = x^2
    // [a, b] // 1
    public static void printSquare(int a, int b){
        // x = i
        // y = x*x
        for (int i = a; i <= b ; i++) {
            System.out.println("x="+i +" y=" + i*i);
        }
    }

    // a,b
    // sum = a + (a+1) + (a+2) + .. + (b-1) + b
    // sum = 1 + 2 +3 +4  + ... + b
    public static int calcSum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b ; i++) {
            sum += i;
        }
        return sum;
    }

    public static void printNumsForStep3(int n){
        // i = 1
        // i = 1+3 = 4
        for (int i = 1; i <= n; i+=3) {
            System.out.println(i);
        }
    }
    /**
     * выводит значение от 1 до n
     */
    public static void printNumsWhile(int n){
        int i = 1;
        while (i <= n) {
            System.out.println("i: " + i);
            i++;
        }
    }

    public static void printNumsFor(int n){
        // for (счетчик; условие ; изменение счетчика после завершения тела)
        for (int i = 1; i <= n; i++ ){
            System.out.println("i : "+ i);
        }
    }


    public static void printNumsWhile1(int n){
        int i = 1;
        while (i <= n) {
            System.out.println("i: " + i);
            i++;
        }

        int j = n;
        while (j >= 1) {
            System.out.println("i: " + j);
            j--;
        }
    }

    public static void printNumsFor1(int n){
        for (int i = 1; i <= n; i++ ){
            System.out.println("i : "+ i);
        }
    }

    public static int enterNum(){
        System.out.println("enter a num:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
