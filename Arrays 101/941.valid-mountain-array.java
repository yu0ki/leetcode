/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] arr) {
        int arr_length = arr.length;

        if (arr_length < 3) {
            return false;
        }

        int mountain_size = 0;
        while (mountain_size + 1 < arr_length && arr[mountain_size] < arr[mountain_size + 1]) {
            mountain_size++;
        }

        if (mountain_size == arr_length - 1 || mountain_size == 0) {
            return false;
        }

        while(mountain_size + 1 < arr_length && arr[mountain_size] > arr[mountain_size + 1]) {
            mountain_size++;
        }

        return mountain_size == arr_length - 1;

    }
}
// @lc code=end

