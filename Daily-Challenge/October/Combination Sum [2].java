/**
 * 
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3481/
 */

class Solution {
    List<List<Integer>> combinations;
    int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.combinations = new ArrayList<>();
        this.candidates = candidates;
        populateComb(0, target, new ArrayList<>());
        return combinations;

    }

    // Populate the combinations
    private void populateComb(int currIdx, int target, List<Integer> currentList) {
        if (target < 0)
            return;
        if (target == 0) {
            combinations.add(new ArrayList(currentList));
            return;
        }
        for (int i = currIdx; i < candidates.length; i++) {
            if (candidates[i] > target)
                continue;
            currentList.add(candidates[i]);
            populateComb(i, target - candidates[i], currentList);
            currentList.remove(currentList.size() - 1);
        }

    }
}
