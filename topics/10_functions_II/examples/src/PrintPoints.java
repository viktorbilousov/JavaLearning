import java.util.List;

public class PrintPoints {

    public static final String name = "Printer";

    /**
     * 1 - ... , 2 - ... ... ..., 3 - [... ... ...] [... ... ...]  [... ... ...]
     * @param points
     * @return
     */
    public static String returnPoints(int points){
        return returnPoints(".", 0, points);
    }


    private static String returnPoints(String points, int deep, int expectedDeep){
        if(deep > expectedDeep) return points;
        String newStr = points.replace(".", "... ");
        return returnPoints(newStr, deep + 1, expectedDeep);
    }

    public static void main(String[] args) {
        System.out.println(returnPoints(2));

        PrintPoints printPoints1 = new PrintPoints();
        PrintPoints printPoints2 = new PrintPoints();


        System.out.println(PrintPoints.returnPoints(1));

    }

}
