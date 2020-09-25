/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        int lSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (total - nums[i] == 2 * lSum)
                return i;
            lSum += nums[i];
        }
        return -1;
    }
}
