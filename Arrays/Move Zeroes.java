/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3157/
 */

class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;

        while (l < nums.length && r < nums.length) {
            if (nums[l] != 0) {

                l++;
                continue;
            }
            if (nums[r] == 0) {

                r++;
                continue;
            }
            if (r > l) {
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
                r++;
            } else
                r++;

        }
    }
}
