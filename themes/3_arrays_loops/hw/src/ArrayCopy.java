import com.sun.source.tree.BreakTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

//Создaать новый масив, который является копией оригинального масива и не изменяет его
public class ArrayCopy {

    public static void main(String[] args) {


        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }


        System.out.println(Arrays.toString(arr));

        System.out.println("call removeNumbers");

        System.out.println("before sum is = " + getSumOfArray(arr));
        int [] copy = copyArray(arr);
        removeNumbers(copy);

        System.out.println("--------");
        System.out.println(Arrays.toString(arr));
        System.out.println("after sum is = " + getSumOfArray(arr));

      //  System.out.println(Arrays.toString(copy));



    }

    public static void removeNumbers(int[] a){
        for (int i = 0; i < a.length; i+=2) {
            if(a[i] % 2 == 0) a[i] = 0;
        }
    }

    // {todo}: write this function without Arrays.copyOf()
    public static int[] copyArray(int[] array){
        return Arrays.copyOf(array, array.length);
    }

    public static int getSumOfArray(int[] array){
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
