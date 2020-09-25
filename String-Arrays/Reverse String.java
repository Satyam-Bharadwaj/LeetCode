/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/
 * 
 */

class Solution {
    public void reverseString(char[] s) {


        reverse(s, 0);
    }

    public void reverse(char[] s, int i) {

        int l = i;
        int r = s.length - i - 1;
        if (l >= r)
            return;

        char temp = s[r];
        s[r] = s[l];
        s[l] = temp;

        reverse(s, i + 1);

    }
}
