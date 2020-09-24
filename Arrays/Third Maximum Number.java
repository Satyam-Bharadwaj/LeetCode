/**
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3231/
 * 
 */

class Solution {
    public int thirdMax(int[] nums) {
        Queue<Integer> top3 = new PriorityQueue<>();

        for (int i : nums) {
            if (top3.size() < 3 && !top3.contains(i)) {
                top3.add(i);
            } else {
                if (top3.peek() < i && !top3.contains(i)) {
                    top3.poll();
                    top3.add(i);
                }
            }
        }
        int max = top3.poll();
        while (top3.size() < 2 && top3.size() > 0) {
            max = top3.poll();
        }
        return max;
    }
}
