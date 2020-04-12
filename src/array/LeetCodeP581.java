package array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/3/27
 */
public class LeetCodeP581 {

    @Test
    public void problem581() {
        int[] nums = new int[]{2, 6, 4, 8, 10, 9, 15};
        int subarray = findUnsortedSubarray(nums);
        System.out.println(subarray);
    }

    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return 0;
        }
        // 用排序后的数组跟原数组的首尾对比
        int[] copyNums = new int[length];
        System.arraycopy(nums, 0, copyNums, 0, length);
        Arrays.sort(copyNums);
        // 首
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == copyNums[i]) {
                length--;
            } else {
                break;
            }
        }
        // 尾
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == copyNums[i]) {
                length--;
            } else {
                break;
            }
        }
        return length;
    }
}
