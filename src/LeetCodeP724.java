import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/3
 */
public class LeetCodeP724 {

    @Test
    public void leetCodeP724() {
        int[] nums = {-1,-1,-1,0,1,1};
        int i = pivotIndex(nums);
        System.out.println(i);
    }

    public int pivotIndex(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }

        int leftSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = sum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
