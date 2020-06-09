package array;

import org.junit.Test;

import java.util.Arrays;

public class LeetCodeP1299 {

    @Test
    public void leetCodeP1299() {
        int[] arr = {17,18,5,4,6,1};
        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        if (length < 1) {
            return null;
        }

        int max = -1;
        // 从后往前替换
        for (int i = length - 1 ; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }
}
