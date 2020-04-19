package array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/19
 */
public class LeetCodeP922 {

    @Test
    public void leetCodeP922() {
        int[] A = {4,2,5,7};
        int[] result = sortArrayByParityII(A);
        System.out.println(Arrays.toString(result));
    }

    public int[] sortArrayByParityII(int[] A) {
        if (A.length < 1) {
            return A;
        }
        // 奇数索引
        int oddIndex = 0;
        // 偶数索引
        int evenIndex = 0;
        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (i % 2 != 0) {
                for ( ; oddIndex < A.length; oddIndex++) {
                    if (A[oddIndex] % 2 != 0) {
                        result[i] = A[oddIndex++];
                        break;
                    }
                }
            } else {
                for ( ; evenIndex < A.length; evenIndex++) {
                    if (A[evenIndex] % 2 == 0) {
                        result[i] = A[evenIndex++];
                        break;
                    }
                }
            }
        }
        return result;
    }
}
