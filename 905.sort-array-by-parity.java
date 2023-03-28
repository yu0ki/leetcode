/*
 * @lc app=leetcode id=905 lang=java
 *
 * [905] Sort Array By Parity
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // 2つのポインタを両端から出発させて、
        // 左が奇数、右が偶数であれば入れ替える
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] % 2 == 1) {
                if (nums[right] % 2 == 0) {
                    int tmp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = tmp;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }

        return nums;
    }
}
// @lc code=end

