/**
 * 
 * https://leetcode.com/problems/subarray-sum-equals-k
 * https://leetcode.com/problems/subarray-sum-equals-k/discuss/867435/DETAILED-EXPLANATION-OF-MATH-BEHIND-O(N)-SOLUTION-PYTHON3
 * 
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 1)
            return nums[0] == k ? 1 : 0;
        // Brute force is find sum of all possible subarrays )(n^3)
        // If we iterate over current elements from l to r and check sum we should have O(n^2)
        int ans = 0;
        for (int l = 0; l < nums.length; l++) {
            int sum = 0;
            for (int r = l; r < nums.length; r++) {
                sum += nums[r];
                if (sum == k)
                    ans++;
            }
        }

        return ans;

    }
}
