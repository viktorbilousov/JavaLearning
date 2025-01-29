import java.io.File;

public class Summator {

    public int sum(int a, int b){
        System.out.println("int");
        return a + b;
    }

    public double sum(double a, double b){
        System.out.println("double");
        return a + b;
    }

    public double sum(float sum, float b){
        System.out.println("double");
        return sum + b;
    }

    public double sum(int a, double b){
        System.out.println("double");
        return a + b;
    }


    public double sum(double a, int b){
        System.out.println("double");
        return a + b;
    }


    public static void main(String[] args) {

        try {
            Integer.parseInt("text");
        }catch (Exception e){
            throw new RuntimeException("Is not a number", e);
        }

        Summator summator = new Summator();

        System.out.println(summator.sum(1, 2));
        System.out.println(summator.sum(1.0, 2.0));

        Utils.sayHello();

        File f = new File("");
        f.setReadable(true, false);
        f.setReadable(true);
    }
}
