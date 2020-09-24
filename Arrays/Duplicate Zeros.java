/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
 * 
 */

class Solution {
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int prev = 0;
                for (int j = i + 1; j < arr.length; j++) {
                    int next = arr[j];
                    arr[j] = prev;
                    prev = next;

                }
                i++;
            }

        }
    }
}
