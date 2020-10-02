/**
 * 
 * https://leetcode.com/problems/trapping-rain-water/submissions/
 */

class Solution {
    public int trap(int[] height) {
        if (height.length < 3)
            return 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);

        }

        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            int limit = Math.min(maxLeft[i], maxRight[i]);

            if (limit > height[i])
                ans += limit - height[i];

        }
        return ans;
    }
}
