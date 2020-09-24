/**
 * 
 * https://leetcode.com/explore/featured/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/
 */

class Solution {
    public boolean checkIfExist(int[] arr) {

        Set<Integer> reversePair = new HashSet<Integer>();
        // If sorting not allowed, better to have a hashmap and insert 2*i and i/2 with proper
        // values;
        for (int i : arr) {
            if (reversePair.contains(2 * i) || (i % 2 == 0 && reversePair.contains(i / 2)))
                return true;
            else {
                reversePair.add(i);

            }
        }
        return false;

    }
}
