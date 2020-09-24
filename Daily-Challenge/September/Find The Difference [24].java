/**
 * 
 * https://leetcode.com/explore/challenge/card/september-leetcoding-challenge/557/week-4-september-22nd-september-28th/3471/
 * 
 * 
 */

// O(2N) space, O(n)+O(26)

class Solution1 {
    public char findTheDifference(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            tCount[t.charAt(i) - 'a']++;
        }
        tCount[t.charAt(t.length() - 1) - 'a']++;

        for (int i = 0; i < 26; i++) {
            if (sCount[i] != tCount[i])
                return (char) ('a' + i);
        }
        return 'a';

    }
}


// O(1)space, O(n)runtime.
class Solution2 {
    public char findTheDifference(String s, String t) {
        int sCount = 0;
        int tCount = 0;

        for (int i = 0; i < s.length(); i++) {
            sCount += (s.charAt(i) - 'a');
            tCount += (t.charAt(i) - 'a');
        }
        tCount += t.charAt(t.length() - 1) - 'a';

        return (char) (tCount - sCount + 'a');

    }
}


