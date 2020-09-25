/***
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1151/
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
