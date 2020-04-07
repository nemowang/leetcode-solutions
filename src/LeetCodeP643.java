import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/3/30
 */
public class LeetCodeP643 {
    @Test
    public void leetCOdeP643() {
        int[] nums = {0,1,1,3,3};
        double maxAverage = findMaxAverage(nums, 4);
        System.out.println(maxAverage);
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxAve = 0.0;
        if (nums.length < 1) {
            return maxAve;
        } else if (nums.length == k || nums.length < k) {
            for (int num : nums) {
                maxAve += num;
            }
            return maxAve/k;
        }
        double d = 0.0;
        for (int i = 0; i < nums.length - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                d += nums[j];
            }
            d /= k;
            maxAve = maxAve > d ? maxAve : d;
            d = 0.0;
        }
        return maxAve;
    }
}
