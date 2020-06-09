package array;

import org.junit.Test;

public class LeetCodeP1266 {

    @Test
    public void leetCodeP1266() {
        int[][] points = {{1,1},{3,4},{-1,0}};
        int count = minTimeToVisitAllPoints(points);
        System.out.println(count);
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length < 1) {
            return 0;
        }
        // 分别计算两点之间x坐标和y坐标之间的最大值，最后求和
        int count = 0;
        for (int i = 1; i < points.length; i++) {
            int xDiff = Math.abs(points[i][0] - points[i - 1][0]);
            int yDiff = Math.abs(points[i][1] - points[i - 1][1]);
            count += Math.max(xDiff, yDiff);
        }
        return count;
    }
}
