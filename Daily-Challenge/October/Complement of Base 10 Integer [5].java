/**
 * https://leetcode.com/explore/challenge/card/october-leetcoding-challenge/559/week-1-october-1st-october-7th/3484/
 * 
 */

class Solution {
    public int bitwiseComplement(int N) {
        if (N == 0)
            return 1;
        // log base conversion formula, +1 for 0th bit
        int numberOfBits = (int) Math.floor(Math.log(N) / Math.log(2) + 1);

        // Left shiting by bumber of bits implies we have 1 at more n+1th bit, -1 would flip all
        // previous bits
        return ((1 << numberOfBits) - 1) ^ N;
    }
}

