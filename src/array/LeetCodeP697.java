package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/2
 */
public class LeetCodeP697 {

    @Test
    public void leetCodeP697() {
        int[] nums = {1,2,2,3,1};
        int shortestSubArray = findShortestSubArray(nums);
        System.out.println(shortestSubArray);
    }

    public int findShortestSubArray(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int curDegree = 1;
        int maxDegree = 1;

        // 1. 使用map存放元素出现频数 key：元素  value:频数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        // 2. 找到频数最大的元素，可能有多个
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            curDegree = entry.getValue();
            maxDegree = maxDegree > curDegree ? maxDegree : curDegree;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxDegree) {
                list.add(entry.getKey());
            }
        }

        // 3. 找到最大频数元素的第一次和最后一次出现所在索引，通过索引获取最短长度
        int curLength = 0;
        int minLength = 10000000;
        for (int num : list) {
            int leftIndex = -1;
            int rightIndex = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == num) {
                    leftIndex = leftIndex < 0 ? i : leftIndex;
                    rightIndex = rightIndex < i ? i : rightIndex;
                }
            }
            curLength = rightIndex - leftIndex;
            minLength = minLength < curLength ? minLength : curLength;
        }
        return minLength + 1;
    }
}
