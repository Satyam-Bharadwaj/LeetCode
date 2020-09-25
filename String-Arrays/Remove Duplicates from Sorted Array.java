/**
 * https://leetcode.com/explore/learn/card/array-and-string/204/conclusion/1173/
 * 
 * 
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int dupCount = 0;
        // count all duplicates => compare i and i-1 to check duplicates.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                dupCount++;
            } else {
                nums[i - dupCount] = nums[i];
            }
        }
        return nums.length - dupCount;
    }
}
