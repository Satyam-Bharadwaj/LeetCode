/**
 * 
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3483/
 * 
 */

class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0] == 0 ? b[1] - a[1] : a[0] - b[0];
        });
        int[] interval = {-1, -1};
        int count = 0;
        for (int[] pair : intervals) {
            if (interval[0] <= pair[0] && interval[1] >= pair[1]) {
                continue;
            }
            interval = pair;
            count++;
        }
        return count;
    }
}
