/*
 * @lc app=leetcode id=1299 lang=java
 *
 * [1299] Replace Elements with Greatest Element on Right Side
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        // 初期最大値
        int greatest = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > greatest) {
                greatest = arr[j];
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < greatest) {
                arr[i] = greatest;
            } else if (arr[i] == greatest) {
                // greatest更新
                greatest = arr[i + 1];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > greatest) {
                        greatest = arr[j];
                    }
                }
                arr[i] = greatest;
            }
        }

        arr[arr.length - 1] = -1;
        return arr;
    }
}
// @lc code=end

