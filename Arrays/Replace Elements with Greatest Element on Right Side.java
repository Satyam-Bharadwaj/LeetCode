/***
 * https://leetcode.com/explore/featured/card/fun-with-arrays/511/in-place-operations/3259/
 * 
 * 
 */
class Solution {
    public int[] replaceElements(int[] arr) {
        int currMax=-1;
        for(int i =arr.length-1;i>=0;i--){
            int temp = currMax;
            currMax=Math.max(arr[i],currMax);
            arr[i]=temp;
        }
        return arr;
    }
}