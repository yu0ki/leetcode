/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {

        int num_len = nums.length;

        if (num_len == 1) { return nums[0]; } 
        else if (num_len == 2) {
            if (nums[0] > nums[1]) {
                return nums[0];
            } else {
                return nums[1];
            }
        }

        // M1みたいに一個ずつ検査していけばいいんじゃないか？
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        int thirdIsReturned = 0;

        for (int i = 1; i < num_len; i++) {
            if (first < nums[i]) {
                third = second;
                second = first;
                first = nums[i];
                thirdIsReturned++;
            } else if (second < nums[i] && nums[i] < first) {
                third = second;
                second = nums[i];
                thirdIsReturned++;
            } else if (third < nums[i] && nums[i] < second) {
                third = nums[i];
                thirdIsReturned++;
            } else if (thirdIsReturned == 0 && nums[i] < first) {
                second = nums[i];
                thirdIsReturned++;
            } else if (thirdIsReturned == 1 && nums[i] < second) {
                third = nums[i];
                thirdIsReturned++;
            }
        }

        if (thirdIsReturned >= 2) {
            return third;
        } else {
            return first;
        }
        
    }
}
// @lc code=end

