/**
 * 
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3473/
 */

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0)
            return 0;
        int count = duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] > timeSeries[i - 1] + duration) {
                count += duration;
            } else {
                count += timeSeries[i] - timeSeries[i - 1];
            }
        }
        return count;
    }
}
