public class ExampleFive {
    public static void main(String[] args) {

        /*for (int i = 0; i <= 100 ; i++) {
            if (i % 12 == 3){
                System.out.println(i);

            }

        }*/
        exampleSix();
    }
    public static void exampleSix () {
        int sum = 0;
        for (int i = 0; i <= 1000 ; i++) {
            if (i % 2 != 0){
                sum++;
            }
            else if (i % 3 != 0){
                sum++;
            }

        }
        System.out.println(sum);
    }

}
