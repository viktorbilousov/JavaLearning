import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int number = 1 ;

        for (int i = 0; i < 10 ; i++) {
            System.out.println(number++);
        }

        int [] numbers = new int[] {5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println(num);
        }

        // [5, 6, 7, 8, 9, 10]
        // 1: i = 5
        // 2: i = 6
        // 3: i = 7

        for (int num : numbers) {
            System.out.println(num);
        }

        int [] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : arr) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }



        String[] words = new String[]{"Viktor" , "Sergey"};

        for (String word : words)
        {
            boolean found = false;

            for (int i : word.chars().toArray()) {
                if (i == 'e') {
                    found = true;
                    break;
                }
            }

            if(found){
                break;
            }
        }

        for (int i = 0; i <= 30; i+=3) {
            System.out.println(i);
        }


    }
}
