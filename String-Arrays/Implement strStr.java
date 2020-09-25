/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/203/introduction-to-string/1161/
 */

// Using inbuilt

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null)
            return 0;
        if (!haystack.contains(needle))
            return -1;
        return haystack.indexOf(needle);
    }
}

// Use pattern matching (there are many know algo's out there)