/*
 https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3469/
 https://leetcode.com/problems/majority-element-ii/
 Thing to note is floor of [n/3] means only 2 elements can be possible.
 Runtime Complexity worstCase : O(n+n)

*/
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Find frequency of all elements
        HashMap<Integer,Integer> frequency = new HashMap<>();
        int qualifyingscore =(int) Math.floor(nums.length/3);
        for(int i:nums){
            frequency.put(i,frequency.getOrDefault(i,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        //Iterate over keys in hashmap and check if frequency more than others
        for(int i : frequency.keySet()){
            if(frequency.get(i)>qualifyingscore)result.add(i);
        }
        return result;
    }
}

