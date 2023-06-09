import java.util.Arrays;

/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        // とりあえず全部二乗
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        // ソートして返却
        Arrays.sort(nums);
        return nums;
    }
}
// @lc code=end

