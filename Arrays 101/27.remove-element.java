/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        // 今まで見つけたvalの数 
        int val_count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i + val_count < nums.length) {
                while (i + val_count < nums.length && nums[i + val_count] == val) {
                    val_count++;
                }
                if (i + val_count < nums.length) {
                    nums[i] = nums[i + val_count];
                }
            }
            
        }
        
        return nums.length - val_count;
    }
}
// @lc code=end

