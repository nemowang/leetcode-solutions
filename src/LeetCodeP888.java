import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/4/10
 */
public class LeetCodeP888 {

    @Test
    public void leetCodeP888() {
        int[] A = {1, 1};
        int[] B = {2, 2};
        int[] swap = fairCandySwap(A, B);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < swap.length; i++) {
            result.append(swap[i]).append(",");
        }
        System.out.println(result.toString());
    }

    public int[] fairCandySwap(int[] A, int[] B) {
        // sumA - x + y = sumB - y + x
        // y = (sumB - sumA) / 2 + x
        int[] result = new int[2];
        int sumA = 0, sumB = 0;
        for (int num : A) {
            sumA += num;
        }
        for (int num : B) {
            sumB += num;
        }
        int temp = (sumB - sumA) / 2;
        for (int numA : A) {
            for (int numB: B) {
                if (numB == temp + numA) {
                    result[0] = numA;
                    result[1] = numB;
                    return result;
                }
            }
        }
        return result;
    }
}
