import java.util.Scanner;

public class CashMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int cntNumbers = calcCntNumbers(input); // это функция, которая будет определять количество цифр
        int a = 0, b =0, c =0, d =0;
        // 1234 -> abcd -> a=1 , b=2 ,c =3 ,d=4
        // 23 -> a=0 , b=0, c =2, d=3
        // пункт 1
        a = getThousands(input); // функция вовзращает тысячи
        b = getHundreds(input); // функция вовзращает сотни
        c = getDec(input); // функция вовзращает десятки
        d = getUnit(input); // возвращает кол-во единиц
        // пункт 2 + 3
        String numberString = "";
        switch (cntNumbers){
            case 4: numberString += getStringThousands(a,b,c,d); break;
            case 3: numberString += getStringHundreds(b,c,d); break;
            case 2: numberString += getStringDec(c,d); break;
            case 1: numberString += getStringUnit(d);; break;
        }
        numberString += " ";
        numberString += getDollar(d);


        System.out.println(numberString);

    }


    private static String getStringThousands(int a, int b, int c, int d) {
        if(c > 10 || c < 0  || d >10 || d < 0 || b < 0 || b > 10 || a < 0 || a > 10){
            System.out.println("number d is wrong!" );
            return "error";
        }

        String result = "";
        if(a == 1) {
            result += "oдна";
        }else if (a == 2) {
            result += "две";
        }
        else {
            // 9999 -> 1000
            result += getStringUnit(d);
        }
        result += " ";

        // 1. когда 4 числа -- вставить (между 4 и 3)

        result += getStringThousendWord(a);
        result += " ";
        // 1112
        if(b != 0) {
            result += getStringHundreds(b,c,d);
        }
        // 1012
        else if(c != 0){
            result += getStringDec(c,d);
        }
        else if(d != 0){
            result += getStringUnit(d);
        }

        return result;

    }

    private static String getStringHundreds(int b, int c, int d) {
        if(c > 10 || c < 0  || d >10 || d < 0 || b <= 0 || b > 10 ){
            System.out.println("number d is wrong!" );
            return "error";
        }

        String result = "";

        switch (b) {
            case 1:
                result += "сто";
                break;
            case 2:
                result += "двести";
                break;
            case 3:
                result += "триста";
                break;
            case 4:
                result += "четыреста";
                break;
            case 5:
                result += "пятьсот";
                break;
            case 6:
                result += "шестьсот";
                break;
            case 7:
                result += "семьсот";
                break;
            case 8:
                result += "восемьсот";
                break;
            case 9:
                result += "девятьсот";
                break;
        }
        // bcd -> 123 -> b=1, c=2, d=3
        // 121
        if(c != 0)  {
            result += " ";
            result += getStringDec(c,d);
        }
        else if(d != 0){
            result += " ";
            result += getStringUnit(d);
        }

        return result;

    }

    // cd = 12 ,
    private static String getStringDec(int c, int d) {
        if(c > 10 || c < 0  || d >10 || d < 0){
            System.out.println("number d is wrong!");
            return "error";
        }

        String result = "";

        // 11-> 19
        // dec + units
        if(c == 1 && (d > 1 || d < 9)){
            switch (d){
                case 1:
                    result += "одиннадцать";
                    break;
                case 2:
                    result += "двенадцать";
                    break;
                case 3:
                    result += "тринадцать";
                    break;
                case 4:
                    result += "четырнадцать";
                    break;
                case 5:
                    result += "пятьнадцать";
                    break;
                case 6:
                    result += "шестьнадцать";
                    break;
                case 7:
                    result += "семьнадцать";
                    break;
                case 8:
                    result += "восемьнадцать";
                    break;
                case 9:
                    result += "девятнадцать";
                    break;
            }
        }else {
            // 20,30,40,5060
            // 50 = 50 + 0
            // 21 ,32, 42, 55
            // 55 = 50 + 5
            switch (c) {
                case 1:
                    result += "десять";
                    break;
                case 2:
                    result += "двадцать";
                    break;
                case 3:
                    result += "тридцать";
                    break;
                case 4:
                    result += "сорок";
                    break;
                case 5:
                    result += "пятьдесят";
                    break;
                case 6:
                    result += "шестьдесят";
                    break;
                case 7:
                    result += "семьдесят";
                    break;
                case 8:
                    result += "восемьдесят";
                    break;
                case 9:
                    result += "девяносто";
                    break;
            }
            if(d != 0) {
                result += " ";
                result += getStringUnit(d);
            }
        }

        // d == 0
        // 10,20,30,40,50,60 ...
        // 10 + 1 == 1 , 20 +2 == 22
        return result;
    }

    private static String getStringUnit(int d) {
        if(d < 0 || d > 10) {
            System.out.println("number d is wrong!");
            return "error";
        }

        switch (d){
            case 1: return "один";
            case 2: return "два";
            case 3: return "три";
            case 4: return "четыре";
            case 5: return "пять";
            case 6: return "шесть";
            case 7: return "семь";
            case 8: return "восемь";
            case 9: return "девять";
        }

        return "";
    }

    private static int getUnit(int input) {
        return input%10; // 1234 % 10 -> 1234 == 1230 + 4
    }

    private static int getDec(int input) {
        return (input%100)/10; // -> 1234%1000 -> 34 / 10 -> 3.4 -> (int) -> 3
    }

    private static int getHundreds(int input) {
        return (input%1000)/100; // -> 1234%1000 -> 234 / 100 -> 2.34 -> (int) -> 2
    }

    public static int getThousands(int input) {
        return input/1000;  // -> 1234/1000 -> 1.234 -> (int) 1
    }

    // 9999
    public static int calcCntNumbers(int input) {
        if(input >= 1000) return 4;
        else if (input >= 100) return 3;
        else if (input >= 10) return 2;
        else return 1;
    }

    public static String getDollar(int d) {
        if(d == 1) return "доллар";
        else if(d>=2 && d <=4) return "доллара";
        else return "долларов";
    }

    //        * тысяч (все остальное)
    //        * тысячи (2-4)
    //        * тысяча (1)
    public static String getStringThousendWord(int a){
        if(a < 0 || a > 10) {
            System.out.println("number d is wrong!");
            return "error";
        }

        if(a == 1) return "тысяча";
        else if( a >= 2 && a <= 4) return "тысячи";
        else return "тысяч";
    }





//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Сумма: ");
//
//        double a =scanner.nextInt();
//
//        if (a / 1000 == 0){
//            System.out.print(" ");
//        }else if (a / 1000 == 1) {
//            System.out.print("одна ");
//        }else if (a / 1000 == 2) {
//            System.out.print("две тысячи ");
//        }else if (a / 1000 == 3) {
//            System.out.print("три тысячи ");
//        }else if (a / 1000 == 4) {
//            System.out.print("четыре тысячи ");
//        }else if (a / 1000 == 5) {
//            System.out.print("пять тысяч ");
//        }else if (a / 1000 == 6) {
//            System.out.print("шесть тысяч ");
//        }else if (a / 1000 == 7) {
//            System.out.print("семь тысяч ");
//        }else if (a / 1000 == 8) {
//            System.out.print("восемь тысяч ");
//        }else if (a / 1000 == 9) {
//            System.out.print("девять тысяч ");
//        }
//
//        /*
//        if ((a / 1000 >= 2) && (a / 1000 <= 5)){
//            System.out.print("тысячи ");
//        }else if ((a / 1000 >= 5) && (a / 1000 <= 9)){
//            System.out.print("тысяч ");
//         */
//
//        if (a / 100 == 0){
//            System.out.print(" ");
//        }else if ((a % 1000)/100 == 10) {
//            System.out.print("сто ");
//        }else if ((a % 1000)/100 == 2) {
//            System.out.print("двести ");
//        }else if ((a % 1000)/100 == 3) {
//            System.out.print("три ");
//        }else if ((a % 1000)/100 == 4) {
//            System.out.print("четыреста ");
//        }else if ((a % 1000)/100 == 5) {
//            System.out.print("пятьсот ");
//        }else if ((a % 1000)/100 == 6) {
//            System.out.print("шестьсот ");
//        }else if ((a % 1000)/100 == 7) {
//            System.out.print("семьсот ");
//        }else if ((a % 1000)/100 == 8) {
//            System.out.print("восемьсот ");
//        }else if (( a % 1000)/100 == 9) {
//            System.out.print("девятьсот ");
//        }
//
//
//
//    }
}
