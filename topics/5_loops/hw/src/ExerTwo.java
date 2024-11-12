public class ExerTwo {
    // 2.1
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = i + sum;
        }
        System.out.println(sum);
    }

    /*
    sum , i
    i:0 sum1 = i
    i:1 sum2 = i + i-1
    i:2 sum3 = i + i-1 + i-2
    ...
    i:9 sum9 = i + i-1 + .. + 0

    podstanovka

    i:0 sum1 = i
    i:1 sum2 = i + sum1
    i:2 sum3 = i + sum2
    ...
    i:9 sum9 = i + sum8

    zamena na sum

    i:0 sum = i
    i:1 sum = i + sum
    i:2 sum = i + sum
    ...
    i:9 sum = i + sum

    sum - resultat

     */
}
