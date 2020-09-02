package array;

import org.junit.Test;

public class LeetCodeP1550 {

    @Test
    public void leetCodeP1550() {
        int[] nums = {2,6,4,1};
        boolean b = this.threeConsecutiveOdds(nums);
        System.out.println(b);
    }

    public boolean threeConsecutiveOdds(int[] arr) {
        if (arr.length < 3) {
            return false;
        }

        int index = 0;

        // 首先找到第一个奇数，判断后两位是否也是奇数
        // 如果遇到偶数就跳过
        while (index < arr.length - 2) {
            if (arr[index] % 2 == 0) {
                // 如果是偶数
                index ++;
                continue;
            } else {
                if (arr[index + 1] % 2 == 0) {
                    index ++;
                    continue;
                }
                if (arr[index + 2] % 2 == 0) {
                    index ++;
                    continue;
                }
                return true;
            }
        }

        return false;
    }
}
