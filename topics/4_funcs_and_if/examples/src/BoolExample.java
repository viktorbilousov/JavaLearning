public class BoolExample {
    public static void main(String[] args) {

        int x = 100;
        int y = 123;


        boolean result = (x != y);

        // операции сранения
        // >, >=, <, <= , ==, !=
        // логические операции
        // &&, ||

        boolean A = true;
        boolean B = false;

        // A && B == false
        // A || B == true

        // !(A && B) == true
        // !(A || B) == false

        // !(A && B) == A || B
        // !(A || B) == A && B




        boolean condition = (100 > 110);

      //  System.out.println(condition);
        check1(100, 1);
        check2(100, 1);

        check3(100, -1);
        check3(-100, 1);
        check3(-100, -1);




        /*

         операторы сравнения

         100 > 110  // false
         110 < 100 // false

         100 >= 100  // true
         100 > 100  // false

         100 <= 99 // false

          100 == 100 //true
          100 == 101 //false

           x != 100 // не равно
           100 != 101 // true

          ! - отрецание

          !(100 >= 100) // !true -> false

          "viktor" == "viktor" // false
         */

        /*
            логические операторы:

            логическое И: &&
            логическое ИЛИ: ||

            true && true -> true
            // (если я хочу кушать) И (дома есть еда) -> иду кушать

            false && true -> false
            false && false -> false


            // Если на улице дождь ИЛИ снег -> беру зонт
            true || true -> true
            false || true -> true
            true || false -> true

            false || false -> false


         */
    }

    public static void check1(int x, int y){

        if(x > 0){
            if(y > 0){
                System.out.println("x > 0 && y > 0");
            }
        }
    }

    public static void check2(int x, int y){

        if(x > 0 && y > 0){
                System.out.println("x > 0 && y > 0");
        }
    }

    public static void check3(int x, int y){

        if(x > 0 || y > 0){
            System.out.println(" x > 0 || y > 0: true");
        } else {
            System.out.println(" x > 0 || y > 0: false");
        }
    }
}
