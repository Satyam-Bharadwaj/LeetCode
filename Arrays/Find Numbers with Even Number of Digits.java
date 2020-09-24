/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3237/
 */

class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for (int x : nums) {
            int digit = (int) Math.floor(Math.log10(x) + 1);
            if (digit % 2 == 0)
                res++;
        }
        return res;
    }

}
