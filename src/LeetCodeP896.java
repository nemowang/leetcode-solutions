import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/11
 */
public class LeetCodeP896 {

    @Test
    public void leetCodeP896() {
        int[] A = {6,5,4,4};
        System.out.println(isMonotonic(A));
    }

    public boolean isMonotonic(int[] A) {
        if (A.length < 1) {
            return false;
        }
        int status = 0;
        int cur = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] < 0) {
                status = -1;
            } else if (A[i] - A[i - 1] > 0) {
                status = 1;
            }
            if (cur != 0 && cur != status) {
                return false;
            }
            cur = status;
        }
        return true;
    }
}
