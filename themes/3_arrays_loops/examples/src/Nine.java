public class Nine {
    public static void main(String[] args) {

        int multRes = mult(4, 5);
        System.out.println(multRes);
    }

    public static int mult(int a, int b) { // a=4 b=5, res =20
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum = sum + a; //перезапись


        }
        return sum;

    }
}
class Main {
    public static void main(String[] args) {
        int res = numGen (-2);
        System.out.println( res);
    }
    public static int numGen (int input){

        if( input < 0 ){
            input *= -1;
        }
        else if (input > 10){
            System.out.println("Ошибка");
            return -1;
        }

        int num = input;

        for (int i = 0; i <= 3 ; i++) {
            num = num * 10 + input; //num += input * 10 //num += input * 10, num *= 10
        }
        return num;

    }

}
/*
a - переменная
res = result
i:0  a
i:1  аа = а * 10 + а
i:2  ааа = аа * 10 + а
i:3  аааа = ааа * 10 + а
i:4  ааааа = аааа * 10 + а

i=0
res = a

i=1
res = res * 10 + a
 */
