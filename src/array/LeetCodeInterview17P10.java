package array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 面试题 17.10. 主要元素
 */
public class LeetCodeInterview17P10 {

    @Test
    public void leetCodeInterview17P10() {
        int[] nums = {3,2,3};
        int res = this.majorityElement(nums);
        System.out.println(res);
    }

    public int majorityElement(int[] nums) {
        if (nums.length < 1) {
            return -1;
        }

        // 使用map保存每个元素的出现次数，key是数组的元素，value是该元素出现次数
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            if (freqMap.containsKey(num)) {
                freqMap.put(num, freqMap.get(num) + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        int halfCount = nums.length / 2;

        Set<Map.Entry<Integer, Integer>> entrySet = freqMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > halfCount) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
