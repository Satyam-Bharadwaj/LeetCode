/**
 * 
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/558/week-5-september-29th-september-30th/3477/
 */

class Solution {
    HashMap<String, Boolean> dp;

    public boolean wordBreak(String s, List<String> wordDict) {
        dp = new HashMap<>();
        HashSet<String> dict = new HashSet<>(wordDict);
        return wordBreakH(s, dict);
    }

    public boolean wordBreakH(String s, HashSet<String> wordDict) {

        if (wordDict.contains(s)) {
            return true;
        }
        if (dp.containsKey(s)) {
            return dp.get(s);
        }

        // Check of left substring is a valid word and process right
        for (int i = 1; i < s.length(); i++) {
            if (wordDict.contains(s.substring(0, i)) && wordBreakH(s.substring(i), wordDict)) {
                dp.put(s, true);
                return true;
            }
        }
        dp.put(s, false);
        return false;
    }


}
