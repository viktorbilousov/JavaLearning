import java.util.Arrays;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {


        Random rand = new Random();
        int [] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000);
        }

        int[] sorterdArray = sortArray(nums);

        System.out.println(Arrays.toString(nums));

    }

    public static int[] sortArray(int[] nums) {
        // todo
        Arrays.sort(nums);
        return nums;
    }


    /**
     * [5, 3, 2, 1 ,7 ]
     *
     * 1: [5] 5 > 3 ?  +  -> 3, 5 , 2, 1, 7
     * 2: [5] 5 > 2 ?  +  -> 3, 2, 5 , 1, 7
     * 3: [5] 5 > 1 ?  +  -> 3, 2,  1, 5 , 7
     * 4: [5] 5 > 7 ?  +  -> 3, 2,  1, 5 , 7
     *
     * 1: [3] 3 > 2? + -> 2, 3, 1, 5, 7
     * ...
     * n: [3] 3 > 7? - -> 2, 1, 3, 5, 7
     */

}
