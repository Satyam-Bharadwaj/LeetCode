/**
 * 
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3475/
 * 
 */

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Solution using sliding window
        if (k < 1)
            return 0;
        int prod = 1;
        int left = 0;
        int right = 0;
        int response = 0;
        while (right < nums.length) {
            prod *= nums[right];
            while (prod >= k && left < nums.length) {
                prod = prod / nums[left];
                left++;
            }
            // update response;
            response += right - left + 1;
            right++;
        }
        return Math.max(response, 0);
    }
}
