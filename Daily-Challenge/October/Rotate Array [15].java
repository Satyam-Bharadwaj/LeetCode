/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/561/week-3-october-15th-october-21st/3496/
 * 
 */

class Solution {
    public void rotate(int[] nums, int k) {
        k = k % (nums.length);
        if (k == 0)
            return;
        // reverse complete list
        rotateRange(nums, 0, nums.length - 1);
        // reverse first k
        rotateRange(nums, 0, k - 1);
        // reverse last n-k
        rotateRange(nums, k, nums.length - 1);
    }

    private void rotateRange(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
