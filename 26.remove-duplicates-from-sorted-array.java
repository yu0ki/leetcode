/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        // 重複カウンター
        int dupl_count = 0;
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] == nums[i - 1]) {
                dupl_count++;
            } else {
                nums[i - dupl_count] = nums[i];
            }
        }

        return nums.length - dupl_count;
    }
}
// @lc code=end

