/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        // 偶数桁の数字の個数
        int answer = 0;
        // numsを前から順番に検査
        for (int num : nums) {
            int digits = 1;
            while (num >= 10) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
// @lc code=end

