/**
 * 
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3482/
 * 
 * 
 */


class Solution {

    public int findPairs(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        Set<Pair> ans = new HashSet<>();
        Arrays.sort(nums);
        for (int i : nums) {

            if (set.contains(i)) {
                ans.add(new Pair(i, k - i));
            }
            set.add(k + i);
        }
        return ans.size();
    }


}
