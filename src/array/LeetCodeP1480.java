package array;

import org.junit.Test;

import java.util.Arrays;

public class LeetCodeP1480 {

    @Test
    public void leetCodeP1480() {
        int[] nums = {1,2,3,4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public int[] runningSum(int[] nums) {
        if (nums.length < 1) {
            return new int[0];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                result[i] += nums[i] + result[i - 1];
            } else {
                result[i] = nums[i];
            }
        }

        return result;
    }
}
