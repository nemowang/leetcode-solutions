package array;

import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/9
 */
public class LeetCodeP867 {

    @Test
    public void leetCodeP867() {
        int[][] A = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transpose = transpose(A);
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < transpose.length; i++) {
            sb.append("{");
            for (int j = 0; j < transpose[i].length; j++) {
                sb.append(transpose[i][j]);
                if (j != transpose[i].length - 1) {
                    sb.append(",");
                }
            }
            sb.append("}");
            if (i != transpose.length - 1) {
                sb.append(",");
            }
        }
        sb.append("}");
        System.out.println(sb.toString());
    }

    public int[][] transpose(int[][] A) {
        if (A.length < 1) {
            return A;
        }
        int[][] trans = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                trans[j][i] = A[i][j];
            }
        }
        return trans;
    }
}
