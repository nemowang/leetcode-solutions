package array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeP1431 {

    @Test
    public void leetCodeP1431() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> booleans = kidsWithCandies(candies, extraCandies);
        System.out.println(booleans);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find maximum in candies
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = max >= candies[i] ? max : candies[i];
        }

        // find if candies[i] + extraCandies >= max
        List<Boolean> resultList = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                resultList.add(true);
            } else {
                resultList.add(false);
            }
        }

        return resultList;
    }
}
