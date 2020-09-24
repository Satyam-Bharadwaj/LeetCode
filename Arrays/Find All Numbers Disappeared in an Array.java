/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3270/
 */

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> solution = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                solution.add(i);
        }
        return solution;
    }
}
