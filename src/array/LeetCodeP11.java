package array;

import org.junit.Test;

/**
 * @Author Nemo Wong
 * @Date 2021/7/20 9:41
 * @Description
 */
public class LeetCodeP11 {

    @Test
    public void problemP11() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = this.maxArea(height);
        System.out.println(maxArea);
    }

    public int maxArea(int[] height) {
        if (height.length < 1) {
            return 0;
        }
        int length = height.length;
        int left = 0, right = length - 1;
        int area = 0;

        while (right > left) {
            boolean isLeftSmaller = height[left] < height[right];
            // 计算当前图形面积
            int distance = right - left;
            int h = isLeftSmaller ? height[left] : height[right];
            int thisArea = distance * h;
            if (thisArea > area) area = thisArea;

            // 移动高度较小的指针
            if (isLeftSmaller) left++;
            else right--;
        }
        return area;
    }
}
