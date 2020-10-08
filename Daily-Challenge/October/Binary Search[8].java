/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/560/week-2-october-8th-october-14th/3488/
 * 
 * 
 */

class Solution {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target)
                return m;

            if (nums[m] < target)
                l = m + 1;
            else {
                r = m - 1;
            }
        }
        return -1;


    }

}
