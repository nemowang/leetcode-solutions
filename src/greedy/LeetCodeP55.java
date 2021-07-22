package greedy;

import org.junit.Test;

/**
 * @Author Nemo Wong
 * @Date 2021/7/21 9:28
 * @Description
 */
public class LeetCodeP55 {

    @Test
    public void problemP55() {
        int[] nums = {3,0,8,2,0,0,1};
        boolean canJump = canJump(nums);
        System.out.println(canJump);
    }

    public boolean canJump(int[] nums) {
        // 遍历数组的每一个元素，实时更新可以到达的最远下标farthest
        // 当farthest大于等于最后一个下标lastIndex时，直接返回true
        // 当遍历到的当前下标大于farthest时，说明无法通过跳跃到达当前下标，返回false
        int farthest = 0;
        int lastIndex = nums.length - 1;

        for (int i=0; i < nums.length; i++) {
            // 当遍历到的当前下标大于farthest时，说明无法通过跳跃到达当前下标，返回false
            if (i > farthest) return false;

            // 实时更新可以到达的最远下标farthest
            farthest = (i + nums[i]) > farthest ? (i + nums[i]) : farthest;

            // 当farthest大于等于最后一个下标lastIndex时，直接返回true
            if (farthest >= lastIndex) return true;
        }

        return false;
    }
}
