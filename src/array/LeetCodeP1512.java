package array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LeetCodeP1512 {

    @Test
    public void leetCodeP1512() {
        int[] nums = {1,2,3,1,1,3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }

    /**
     * 用哈希表统计每个数在序列中出现的次数，假设数字 kk 在序列中出现的次数为 vv，那么满足题目中所说的
     * nums[i]=nums[j]=k(i<j) 的(i,j) 的数量就是v(v−1)/2，
     * 即k这个数值对答案的贡献是v(v−1)/2。
     * 我们只需要把所有数值的贡献相加，即可得到答案。
     * @param nums
     * @return
     */
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> pairsNumMap = new HashMap<>();

        for (int num : nums) {
            pairsNumMap.put(num, pairsNumMap.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        Set<Map.Entry<Integer, Integer>> entrySet = pairsNumMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            int v = entry.getValue();
            result += v * (v - 1) / 2;
        }

        return result;
    }
}
