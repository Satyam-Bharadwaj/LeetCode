/***
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
 */

class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3)
            return false;

        boolean uphill = true;

        if (A[0] < A[1])
            uphill = true;
        if (A[0] > A[1])
            return false;
        for (int i = 2; i < A.length; i++) {
            // go up and check uphill
            // check equal
            // if i < i-1 and its downhill
            if ((A[i] > A[i - 1] && !uphill) || A[i] == A[i - 1])
                return false;
            if (A[i] < A[i - 1] && uphill) {
                uphill = !uphill;
            }


        }
        return !uphill;
    }
}
