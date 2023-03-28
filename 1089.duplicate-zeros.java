/*
 * @lc app=leetcode id=1089 lang=java
 *
 * [1089] Duplicate Zeros
 */

// @lc code=start
class Solution {
    public void duplicateZeros(int[] arr) {
        int[] answer = new int[arr.length];
        // answerをどこまで埋めた？
        int answer_index = 0;

        // arrを前から走査してanswerを埋める
        for (int i = 0; answer_index < arr.length; i++) {
            if (arr[i] == 0) {
                answer[answer_index] = 0;
                if (answer_index != arr.length - 1) {
                    answer[answer_index + 1] = 0;
                    answer_index += 2;
                } else {
                    answer_index++;
                }
            } else {
                answer[answer_index] = arr[i];
                answer_index++;
            }
        }
        // arr = answer;
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(answer));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = answer[i];
        }
    }
}
// @lc code=end

