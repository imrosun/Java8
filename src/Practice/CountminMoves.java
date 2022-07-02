package Practice;
import java.util.*;
public class CountminMoves {
    public static void main(String[] args) {
        int[] arr = {1,10,29,7,5};
        System.out.println(minMoves(arr));
    }
    static int minMoves(int[] nums){
        Arrays.sort(nums);
        int sum = 0;
        int median = nums[nums.length/2];
        for (int num : nums) {
            sum = sum + Math.abs(median - num);
        }
        return sum;
    }
}
