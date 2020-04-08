import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/8
 */
public class LeetCodeP832 {
    @Test
    public void leetCodeP832() {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] result = flipAndInvertImage(A);
        System.out.println(result);
    }

    public int[][] flipAndInvertImage(int[][] A) {
        if (A.length < 1) {
            return A;
        }
        // 翻转
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0; j < length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][length - 1 - j];
                A[i][length - 1 - j] = temp;
            }
        }

        // 反转
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = A[i][j] == 0 ? 1 : 0;
            }
        }
        return A;
    }
}
