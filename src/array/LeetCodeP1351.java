package array;

import org.junit.Test;

public class LeetCodeP1351 {

    @Test
    public void leetCodeP1351() {
        int[][] grid = {{4,3,2,-1}, {3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}};
        int negativesCount = countNegatives(grid);
        System.out.println(negativesCount);
    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        if (grid.length < 1) {
            return count;
        }

        int subLength = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < subLength; j++) {
                if (grid[i][j] < 0) {
                    count += subLength - j;
                    break;
                }
            }
        }

        return count;
    }
}
