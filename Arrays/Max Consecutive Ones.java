/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3238/
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
