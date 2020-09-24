/**
 * 
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int countOfValues = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countOfValues > 0 && nums[i] != val) {
                nums[i - countOfValues] = nums[i];
            } else if (nums[i] == val) {
                countOfValues++;
            }

        }

        return nums.length - countOfValues;

    }
}
