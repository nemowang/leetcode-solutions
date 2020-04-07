import org.junit.Test;

/**
 * @author Nemo
 * @version 1.0
 * @date 2020/3/28
 */
public class LeetCodeP605 {

    @Test
    public void leetCodeP605() {
        int[] flowerbed = {0,1,0};
        int n = 1;
        boolean b = canPlaceFlowers(flowerbed, n);
        System.out.println(b);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length < 1) {
            return false;
        }
        else if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        // 记录剩余符合规则的位置的数量
        int legal = 0;
        // 遍历时并把n个花种在符合规则的位置
        int left = n;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                if (i == 0) {
                    if (flowerbed[i+1] == 0) {
                        legal++;
                        if (left > 0) {
                            flowerbed[i] = 1;
                            left--;
                        }
                    }
                } else if (i == flowerbed.length-1) {
                    if (flowerbed[i-1] == 0) {
                        legal++;
                        if (left > 0) {
                            flowerbed[i] = 1;
                            left--;
                        }
                    }
                } else if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                    legal++;
                    if (left > 0) {
                        flowerbed[i] = 1;
                        left--;
                    }
                }
            }
        }
        return legal >= n;
    }
}
