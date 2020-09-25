/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1301/
 */

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
                if (curr > max) {
                    max = curr;
                }

            } else {
                curr = 0;

            }
        }
        return max;
    }
}
