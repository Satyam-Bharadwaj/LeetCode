/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
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
