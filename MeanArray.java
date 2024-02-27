import java.util.Arrays;

public class MeanArray {
    public static double trimMean(int[] nums){
        Arrays.sort(nums);
        int rem = (int) (nums.length*0.05);
        int sum = 0;
        for (int i=rem; i<nums.length-rem; i++){
            sum += nums[i];
        }

        return sum/(nums.length-rem-rem);
    }
    public static void main(String[] args) {

    }
}
