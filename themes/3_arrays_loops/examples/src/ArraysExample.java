public class ArraysExample {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // [тип данных][] [name of array] =  new [тип данных][cnt elements in array]
        String[] names = new String[16];
        int[] ages = new int[10];
        double[] weigth = new double[0];

        names[0] = "Vitya";
        names[1] = "Katya";
        names[2] = "Sergey";
        names[10] = "Masha";

        System.out.println(names);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[10]);


        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 31;
        arr1[2] = 10;
        arr1[2] = 11;
      //  arr1[3] = 10; // error arr1[3] -> 4 element

        int[] arr2 = new int[] {1,2,3,4,5,29183721};
        // arr2[0] = 1, arr1[1] = 2 ...

        System.out.println(arr2.length); // количество елементов в массиве

        printFirstAndLastElement(arr1); // не елемент, а целый масив как агрумент функции

        // int[] = [int, int , int , int]

        int a1 = 1 ;
        int b1[] = new int[1];
        b1[0] = 1;

        addOne(a1);
        addOneInArr(b1);

        System.out.println(a1); // 1
        System.out.println(b1[0]); // 2
    }

    public static void printFirstAndLastElement(int[] array){
        System.out.println("first = " + array[0]);
        System.out.println("last = " +array[array.length-1]);
        // int a [3]
        // a.length = 3
        // a[2]

        // int b [5]
        // b.length = 5
        // b[4]
    }

    public static void addOneInArr(int[] array){
        array[0] += 1;
    }

    public static void addOne(int num){
        num += 1;
    }

}
