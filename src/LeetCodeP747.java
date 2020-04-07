import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/7
 */
public class LeetCodeP747 {

    @Test
    public void leetCode747() {
        int[] nums = {0,0,1,2};
        int index = dominantIndex(nums);
        System.out.println(index);
    }

    public int dominantIndex(int[] nums) {
        int maxIndex = -1;
        if (nums.length < 1) {
            return maxIndex;
        }
        int maxNum = -1;

        for (int i = 0; i < nums.length; i++) {
            if (maxNum < nums[i]) {
                maxNum = nums[i];
                maxIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex) {
                if (maxNum < 2 * nums[i]) {
                    return -1;
                }
            }
        }
        return maxIndex;
    }
}
