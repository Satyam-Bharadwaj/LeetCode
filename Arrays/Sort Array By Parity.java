/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3260/
 * 
 */

class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length];
        int fp = 0;
        int bp = A.length - 1;
        for (int x : A) {
            if (x % 2 == 0)
                B[fp++] = x;
            else {
                B[bp--] = x;
            }
        }
        return B;
    }
}
