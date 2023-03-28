import java.util.Arrays;

/*
 * @lc app=leetcode id=1051 lang=java
 *
 * [1051] Height Checker
 */

// @lc code=start
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int counter = 0;
        for (int i = 0; i < expected.length; i++) {
            if (expected[i] != heights[i]) {
                counter++;
            }
        }
        return counter;
    }
}
// @lc code=end

