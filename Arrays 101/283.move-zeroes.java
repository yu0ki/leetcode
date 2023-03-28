/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        // int readPointer = 0; <= i のこと
        int writePointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[writePointer] = nums[i];
                writePointer++;
            }
        }

        while (writePointer < nums.length) {
            nums[writePointer] = 0;
            writePointer++;
        }
    }
}
// @lc code=end

