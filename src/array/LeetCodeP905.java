package array;

import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/12
 */
public class LeetCodeP905 {

    @Test
    public void leetCodeP905() {
        int[] A = {0,1,3};
        int[] sortArrayByParity = sortArrayByParity(A);
        StringBuilder stringBuilder = new StringBuilder("{");
        for (int i = 0; i < sortArrayByParity.length; i++) {
            stringBuilder.append(sortArrayByParity[i]);
            if (i != sortArrayByParity.length - 1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }

    public int[] sortArrayByParity(int[] A) {
        if (A.length < 1) {
            return A;
        }
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if (A[left] % 2 != 0) {
                while (right > left) {
                    if (A[right] % 2 == 0) {
                        int temp = A[left];
                        A[left] = A[right];
                        A[right] = temp;
                        break;
                    }
                    right--;
                }
            }
            left++;
        }
        return A;
    }
}
