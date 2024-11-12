public class fgf {
    public static void main(String[] args) {

        String res = concString ("hello ","world!");
        System.out.println(res);
    }

    private static String concString(String a, String b) {
        String res = a + b;
        return res;
    }


}
