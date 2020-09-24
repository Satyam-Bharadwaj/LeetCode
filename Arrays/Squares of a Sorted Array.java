/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3261/
 */

class Solution {
    public int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int fp = 0;
        int bp = A.length - 1;
        int arrptr = bp;
        for (int x = 0; x < A.length; x++) {
            if (A[fp] * A[fp] > A[bp] * A[bp]) {
                res[arrptr--] = A[fp] * A[fp];
                fp++;
            } else {
                res[arrptr--] = A[bp] * A[bp];
                bp--;
            }
        }
        return res;
    }
}
