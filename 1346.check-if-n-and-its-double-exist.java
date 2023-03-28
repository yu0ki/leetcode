/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        // 返却する変数
        boolean answer = false;
        // 素直に総当たりしよう
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j] * 2 && i != j) {
                    answer = true;
                    break;
                }
            }

            if (answer) {
                break;
            }
        }
        return answer;
        
    }
}
// @lc code=end

