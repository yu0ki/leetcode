/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */

// @lc code=start
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive_counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecutive_counter++;
            } else {
                consecutive_counter = 0;
            }
        }
        return consecutive_counter;
    }
}
// @lc code=end

