public class AripthmeticOperationsExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // бинарные операции (2 числа)
        System.out.println("a = "+  a + "  b = "+ b);
        System.out.println("a + b = " +  (a + b));
        System.out.println("a - b = " +  (a - b));
        System.out.println("a * b = " +  (a * b));
        System.out.println("a / b = " +  (a / b));
        System.out.println("a % b = " +  (a % b)); // остаток от деления

        System.out.println(11 % 2); // остаток от деления 11 % 2 == 1 -> 11/2 -> [5] * 2 = 10
        System.out.println(3 % 2); // остаток от деления 11 % 2 == 1 -> 11/2 -> [5] * 2 = 10
        System.out.println(4 % 2); // остаток от деления 11 % 2 == 1 -> 11/2 -> [5] * 2 = 10

        //coкращенные бинарные операции

        // +=
        // -=
        // /=
        // *=
        // %=

        int c1 = 12;
        int c2 = 12;
        System.out.println("c1, c2 = "  + c1);

        c1 = c1 + 10;
        System.out.println("c1 = c1 + 10 = " + c1);


        c2 += 10;
        System.out.println("c1 = c1 + 10 = "  + c2);

        // унарные операции ( 1 число )
        System.out.println(a++); // ++ -> +1
        System.out.println(b--); // -- -> -1

        int z1 = 100;
        int z2 = 100;


        // z1 ++ -> z1 = z1 + 1
        System.out.println("z1++ = " + z1++);
        System.out.println("z1= " +  z1);

        System.out.println("++z2 = " +  ++z2);
        System.out.println("z2 = " + z2);

    }

}
