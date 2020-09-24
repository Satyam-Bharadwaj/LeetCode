/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3228/
 */

class Solution {
    public int heightChecker(int[] heights) {
        int [] sorted = Arrays.copyOf(heights,heights.length);
        Arrays.sort(sorted);
        int res = 0;
        for(int i =0; i< sorted.length;i++){
            if(heights[i]!=sorted[i]){
                res++;
            }
        }
        
        return res;
    }
}