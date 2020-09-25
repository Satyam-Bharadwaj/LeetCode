/**
 * Core logic: only two combinations possible, compare both and get larger on early.
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3472/
 */
class Solution {
    public String largestNumber(int[] nums) {
        if (nums.length == 0)
            return "";
        List<Integer> numList = new ArrayList<>();
        for (int i : nums) {
            numList.add(i);
        }
        Collections.sort(numList, (Integer i1, Integer i2) -> {
            return (i2 + "" + i1).compareTo(i1 + "" + i2);
        });
        if (numList.get(0) == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        for (int i : numList) {
            sb.append(i);
        }

        return sb.toString();

    }
}
