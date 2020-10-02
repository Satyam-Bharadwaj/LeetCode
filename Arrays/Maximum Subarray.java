/**
 * 
 * https://leetcode.com/problems/maximum-subarray/
 */
// We can use a single variable instead of array...
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int max = nums[0];
        int[] state = new int[nums.length];
        state[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            state[i] = Math.max(nums[i], state[i - 1] + nums[i]);
            max = Math.max(state[i], max);
        }
        return max;
    }
}
