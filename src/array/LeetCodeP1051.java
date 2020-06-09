package array;

import org.junit.Test;

import java.util.Arrays;

public class LeetCodeP1051 {

    @Test
    public void leetCodeP1051() {
        int[] heights = {1,1,4,2,1,3};
        int count = heightChecker(heights);
        System.out.println(count);
    }

    public int heightChecker(int[] heights) {
        if (heights.length < 2) {
            return 0;
        }
        int[] unsorted = new int[heights.length];
        System.arraycopy(heights, 0, unsorted, 0, heights.length);
        Arrays.sort(heights);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (unsorted[i] != heights[i]) {
                count ++;
            }
        }
        return count;
    }
}
