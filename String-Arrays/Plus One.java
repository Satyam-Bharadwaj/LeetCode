/**
 * 
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
 */

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            result.add(0, (digits[i] + carry) % 10);
            if (digits[i] + carry > 9) {
                carry = 1;

            } else {
                carry = 0;
            }

        }
        if (carry == 1)
            result.add(0, 1);
        int[] response = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            response[i] = result.get(i);
        }
        return response;
    }
}
