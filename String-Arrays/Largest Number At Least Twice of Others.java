/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
 */

class Solution {
    public int dominantIndex(int[] nums) {

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[pos])
                pos = i;

        }

        for (int i = 0; i < nums.length; i++) {
            if (i == pos)
                continue;
            if (2 * nums[i] > nums[pos])
                return -1;
        }
        return pos;
    }
}
