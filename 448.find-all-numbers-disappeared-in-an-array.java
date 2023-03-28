import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        int nums_length = nums.length;

        // nums中に存在しない数字に対応するindexの位置にある数字をマイナスにする
        for (int i = 0; i < nums_length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = - nums[Math.abs(nums[i]) - 1];
            }
            
        }

        for (int i = 0; i < nums_length; i++) {
            if (nums[i] > 0) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
// @lc code=end

